package ru.testbed.identity.dto;

import java.util.List;

/** Сгенерировано из manifest.yaml — не править руками. */
public class RoleDto {

    private String name;
    private List<String> permissions;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public List<String> getPermissions() { return permissions; }
    public void setPermissions(List<String> permissions) { this.permissions = permissions; }
}
