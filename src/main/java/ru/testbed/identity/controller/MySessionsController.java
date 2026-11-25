package ru.testbed.identity.controller;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.testbed.identity.dto.SessionDto;

@RestController
@RequestMapping("/api/v1/me/sessions")
public class MySessionsController {

    @GetMapping
    public ResponseEntity<List<SessionDto>> listMySessions() {
        return ResponseEntity.ok(List.of());
    }

}
