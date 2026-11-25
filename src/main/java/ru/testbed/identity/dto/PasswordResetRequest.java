package ru.testbed.identity.dto;

/** Сгенерировано из manifest.yaml — не править руками. */
public class PasswordResetRequest {

    private String resetToken;
    private String newPassword;

    public String getResetToken() { return resetToken; }
    public void setResetToken(String resetToken) { this.resetToken = resetToken; }
    public String getNewPassword() { return newPassword; }
    public void setNewPassword(String newPassword) { this.newPassword = newPassword; }
}
