package ru.testbed.identity.dto;

/** Сгенерировано из manifest.yaml — не править руками. */
public class RegisterRequest {

    private String email;
    private String password;
    private String passwordConfirm;
    private String phone;
    private String inviteCode;
    private Boolean acceptTerms;

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public String getPasswordConfirm() { return passwordConfirm; }
    public void setPasswordConfirm(String passwordConfirm) { this.passwordConfirm = passwordConfirm; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public String getInviteCode() { return inviteCode; }
    public void setInviteCode(String inviteCode) { this.inviteCode = inviteCode; }
    public Boolean getAcceptTerms() { return acceptTerms; }
    public void setAcceptTerms(Boolean acceptTerms) { this.acceptTerms = acceptTerms; }
}
