package ru.testbed.identity.dto;

import java.util.List;

/** Сгенерировано из manifest.yaml — не править руками. */
public class ApiKeyCreateRequest {

    private String name;
    private List<String> scopes;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public List<String> getScopes() { return scopes; }
    public void setScopes(List<String> scopes) { this.scopes = scopes; }
}
