# sdd-fixture-identity

> ⚠️ Намеренно уязвимое тестовое приложение. Не разворачивать в доступной сети.
> Все «секреты», токены, ключи и персональные данные вымышлены или взяты из публичной документации
> (пример ключа AWS, JWT с jwt.io, тестовые номера карт).

Тестовый стенд для движка детекции чувствительных данных в API (SDD, продукт APISEC):
сервис аутентификации: вход, токены, OAuth, ключи API, админка. Для каждого поля, параметра, endpoint'а и константы заранее записан правильный ответ,
поэтому по результату сканирования видно, где движок прав, а где ошибся.

Spring Boot 3.3, Java 17, порт 8083.

## Что внутри

| файл | что это |
|---|---|
| `src/` | код приложения: `controller/` — endpoint'ы, `dto/` — модели с чувствительными полями, `config/` — константы с секретами и ПД |
| `manifest.yaml` | разметка: что лежит в каждом поле и почему. Источник, из которого сгенерировано всё остальное |
| `expected.json` | правильные ответы для движка (поля, endpoint'ы, константы) |
| `inventory.route_candidates.json` | эталонная инвентаризация: что должен выдать анализатор на этом коде |
| `openapi.yaml` | спецификация API со схемами ответов — вход для OpenAPI-адаптера |
| `tools/score.py` | сверка отчёта движка с `expected.json` |

Объём разметки: 57 размеченных полей и параметров (87 мест в API),
из них неочевидных (`hard`) — 13, ловушек (`trap`) — 9, спорных (`GRAY`) — 9;
20 endpoint'ов; 17 констант (12 с чувствительным значением, 4 ловушек).

## Endpoint'ы

| endpoint | ожидаемые категории | признаки |
|---|---|---|
| `POST /api/v1/auth/login` | AUTH |  |
| `POST /api/v1/auth/register` | AUTH, PII_DIRECT |  |
| `POST /api/v1/auth/refresh` | AUTH |  |
| `POST /api/v1/auth/password/reset` | AUTH |  |
| `POST /api/v1/auth/mfa/verify` | AUTH |  |
| `POST /api/v1/auth/logout` | AUTH |  |
| `GET /oauth2/authorize` | AUTH |  |
| `POST /oauth2/token` | AUTH |  |
| `GET /admin/users` | AUTH, PII_DIRECT | admin |
| `GET /admin/users/{userId}` | AUTH, PII_DIRECT | admin |
| `POST /admin/users/{userId}/impersonate` | AUTH | admin |
| `DELETE /admin/users/{userId}/sessions` | AUTH | admin |
| `GET /api/v1/roles` | AUTH |  |
| `POST /api/v1/api-keys` | AUTH |  |
| `GET /api/v1/api-keys` | AUTH |  |
| `GET /api/v1/me/sessions` | AUTH, PII_INDIRECT |  |
| `GET /config/keycloak.json` | AUTH |  |
| `GET /config/ui-theme.json` | — |  |
| `GET /actuator/env` | AUTH | admin |
| `POST /api/v1/nlp/tokenize` | — |  |

Полная разметка полей — в `manifest.yaml`: у каждого поля метка категории и пояснение.

## Как пользоваться

Запустить приложение:

```bash
mvn spring-boot:run
```

Проверить движок (нужен собранный `sdd` из sdd-prototype и каталог правил):

```bash
mkdir -p results
sdd scan -input inventory.route_candidates.json -rules <каталог правил> -out results/report.json
python3 tools/score.py --pair expected.json results/report.json --md results/scorecard.md
```

Проверить анализатор: просканируйте этот репозиторий и сравните результат с `inventory.route_candidates.json`
или подайте его инвентаризацию движку вместо эталонной и сравните метрики.

## Разметка

| метка | смысл |
|---|---|
| `PII_DIRECT`, `AUTH`, … | здесь лежат данные этой категории |
| без метки | обычное поле: находка на нём — ложное срабатывание |
| `NONE trap` | ловушка: похоже на чувствительное, но нет |
| `КАТЕГОРИЯ hard` | чувствительное, но имя не подсказывает |
| `accept=A\|B` | другие категории тоже засчитываются |
| `GRAY` | спорно, в метрики не идёт |

Код, `expected.json`, инвентаризация и `openapi.yaml` сгенерированы из `manifest.yaml` генератором sdd-testbed.
Руками их не правят: меняется разметка, затем всё перегенерируется.

Связанные репозитории: sdd-fixture-bank, sdd-fixture-clinic, sdd-fixture-identity, sdd-fixture-workflow, sdd-fixture-catalog.
