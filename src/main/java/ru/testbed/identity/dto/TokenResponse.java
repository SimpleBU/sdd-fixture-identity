package ru.testbed.identity.dto;

/** Сгенерировано из manifest.yaml — не править руками. */
public class TokenResponse {

    private String accessToken;
    private String refreshToken;
    private String idToken;
    private String tokenType;
    private Long expiresIn;
    private String scope;

    public String getAccessToken() { return accessToken; }
    public void setAccessToken(String accessToken) { this.accessToken = accessToken; }
    public String getRefreshToken() { return refreshToken; }
    public void setRefreshToken(String refreshToken) { this.refreshToken = refreshToken; }
    public String getIdToken() { return idToken; }
    public void setIdToken(String idToken) { this.idToken = idToken; }
    public String getTokenType() { return tokenType; }
    public void setTokenType(String tokenType) { this.tokenType = tokenType; }
    public Long getExpiresIn() { return expiresIn; }
    public void setExpiresIn(Long expiresIn) { this.expiresIn = expiresIn; }
    public String getScope() { return scope; }
    public void setScope(String scope) { this.scope = scope; }
}
