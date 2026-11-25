package ru.testbed.identity.controller;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.testbed.identity.dto.RoleDto;

@RestController
@RequestMapping("/api/v1/roles")
public class RoleController {

    @GetMapping
    public ResponseEntity<List<RoleDto>> listRoles() {
        return ResponseEntity.ok(List.of());
    }

}
