package ru.testbed.identity.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.testbed.identity.dto.LoginRequest;
import ru.testbed.identity.dto.MfaVerifyRequest;
import ru.testbed.identity.dto.PasswordResetRequest;
import ru.testbed.identity.dto.RegisterRequest;
import ru.testbed.identity.dto.TokenResponse;
import ru.testbed.identity.model.User;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    @PostMapping("/login")
    public ResponseEntity<TokenResponse> login(@RequestBody LoginRequest credentials) {
        return ResponseEntity.ok(new TokenResponse());
    }

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody RegisterRequest request) {
        return ResponseEntity.ok(new User());
    }

    @PostMapping("/refresh")
    public ResponseEntity<TokenResponse> refresh(@RequestHeader(name = "Authorization", required = false) String authorization) {
        return ResponseEntity.ok(new TokenResponse());
    }

    @PostMapping("/password/reset")
    public ResponseEntity<Void> resetPassword(@RequestBody PasswordResetRequest request) {
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/mfa/verify")
    public ResponseEntity<TokenResponse> verifyMfa(@RequestBody MfaVerifyRequest request) {
        return ResponseEntity.ok(new TokenResponse());
    }

    @PostMapping("/logout")
    public ResponseEntity<Void> logout(
            @RequestHeader(name = "Authorization", required = false) String authorization,
            @RequestHeader(name = "Cookie", required = false) String cookie) {
        SecurityContextHolder.clearContext();
        return ResponseEntity.noContent().build();
    }

}
