package ru.testbed.identity.controller;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.testbed.identity.dto.ApiKeyCreateRequest;
import ru.testbed.identity.dto.ApiKeyDto;

/** Выдача API-ключей. Путь api-keys правила не знают. */
@RestController
@RequestMapping("/api/v1/api-keys")
public class ApiKeyController {

    @PostMapping
    public ResponseEntity<ApiKeyDto> createApiKey(@RequestBody ApiKeyCreateRequest request) {
        return ResponseEntity.ok(new ApiKeyDto());
    }

    @GetMapping
    public ResponseEntity<List<ApiKeyDto>> listApiKeys(@RequestHeader(name = "X-Api-Key", required = false) String xApiKey) {
        return ResponseEntity.ok(List.of());
    }

}
