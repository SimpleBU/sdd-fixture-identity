package ru.testbed.identity.dto;

/** Сгенерировано из manifest.yaml — не править руками. */
public class MfaVerifyRequest {

    private String mfaCode;
    private String deviceId;
    private Boolean trustDevice;

    public String getMfaCode() { return mfaCode; }
    public void setMfaCode(String mfaCode) { this.mfaCode = mfaCode; }
    public String getDeviceId() { return deviceId; }
    public void setDeviceId(String deviceId) { this.deviceId = deviceId; }
    public Boolean getTrustDevice() { return trustDevice; }
    public void setTrustDevice(Boolean trustDevice) { this.trustDevice = trustDevice; }
}
