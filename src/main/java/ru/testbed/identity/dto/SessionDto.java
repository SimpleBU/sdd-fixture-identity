package ru.testbed.identity.dto;

import java.time.Instant;

/** Сгенерировано из manifest.yaml — не править руками. */
public class SessionDto {

    private String sessionId;
    private String userAgent;
    private String ip;
    private String location;
    private Instant createdAt;

    public String getSessionId() { return sessionId; }
    public void setSessionId(String sessionId) { this.sessionId = sessionId; }
    public String getUserAgent() { return userAgent; }
    public void setUserAgent(String userAgent) { this.userAgent = userAgent; }
    public String getIp() { return ip; }
    public void setIp(String ip) { this.ip = ip; }
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
    public Instant getCreatedAt() { return createdAt; }
    public void setCreatedAt(Instant createdAt) { this.createdAt = createdAt; }
}
