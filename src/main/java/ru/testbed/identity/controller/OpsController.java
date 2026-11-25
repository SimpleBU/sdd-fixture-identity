package ru.testbed.identity.controller;

import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/actuator")
public class OpsController {

    @GetMapping("/env")
    public ResponseEntity<Map<String, Object>> env() {
        return ResponseEntity.ok(Map.of());
    }

}
