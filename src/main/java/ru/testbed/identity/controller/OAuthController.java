package ru.testbed.identity.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.testbed.identity.dto.TokenResponse;

@RestController
@RequestMapping("/oauth2")
public class OAuthController {

    @GetMapping("/authorize")
    public ResponseEntity<Void> authorize(
            @RequestParam(name = "response_type", required = false) String responseType,
            @RequestParam(name = "client_id", required = false) String clientId,
            @RequestParam(name = "redirect_uri", required = false) String redirectUri,
            @RequestParam(name = "state", required = false) String state,
            @RequestParam(name = "code_challenge", required = false) String codeChallenge,
            @RequestParam(name = "nonce", required = false) String nonce) {
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/token")
    public ResponseEntity<TokenResponse> token(
            @RequestParam(name = "grant_type", required = false) String grantType,
            @RequestParam(name = "code", required = false) String code,
            @RequestParam(name = "redirect_uri", required = false) String redirectUri,
            @RequestParam(name = "client_id", required = false) String clientId,
            @RequestParam(name = "client_secret", required = false) String clientSecret,
            @RequestParam(name = "code_verifier", required = false) String codeVerifier,
            @RequestParam(name = "refresh_token", required = false) String refreshToken) {
        return ResponseEntity.ok(new TokenResponse());
    }

}
