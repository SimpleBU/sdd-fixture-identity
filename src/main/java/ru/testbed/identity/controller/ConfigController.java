package ru.testbed.identity.controller;

import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class ConfigController {

    @GetMapping("/keycloak.json")
    public ResponseEntity<Map<String, Object>> keycloakConfig() {
        return ResponseEntity.ok(Map.of());
    }

    @GetMapping("/ui-theme.json")
    public ResponseEntity<Map<String, Object>> uiTheme() {
        return ResponseEntity.ok(Map.of());
    }

}
