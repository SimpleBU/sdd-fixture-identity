package ru.testbed.identity.controller;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.testbed.identity.dto.TokenResponse;
import ru.testbed.identity.model.User;

@RestController
@RequestMapping("/admin/users")
public class UserAdminController {

    @GetMapping
    public ResponseEntity<List<User>> listUsers(
            @RequestParam(name = "email", required = false) String email,
            @RequestParam(name = "page", required = false) Integer page) {
        return ResponseEntity.ok(List.of());
    }

    @GetMapping("/{userId}")
    public ResponseEntity<User> getUser(@PathVariable("userId") Long userId) {
        return ResponseEntity.ok(new User());
    }

    @PostMapping("/{userId}/impersonate")
    public ResponseEntity<TokenResponse> impersonate(@PathVariable("userId") Long userId) {
        return ResponseEntity.ok(new TokenResponse());
    }

    @DeleteMapping("/{userId}/sessions")
    public ResponseEntity<Void> dropSessions(@PathVariable("userId") Long userId) {
        return ResponseEntity.noContent().build();
    }

}
