package ru.testbed.identity.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.testbed.identity.dto.TokenizeRequest;
import ru.testbed.identity.dto.TokenizeResponse;

/** Ловушка: токенизация текста (NLP), а не токены доступа. */
@RestController
@RequestMapping("/api/v1/nlp")
public class TokenizerController {

    @PostMapping("/tokenize")
    public ResponseEntity<TokenizeResponse> tokenize(@RequestBody TokenizeRequest request) {
        return ResponseEntity.ok(new TokenizeResponse());
    }

}
