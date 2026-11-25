package ru.testbed.identity.dto;

/** Сгенерировано из manifest.yaml — не править руками. */
public class TokenizeRequest {

    private String text;
    private String tokenizer;
    private Integer maxTokens;

    public String getText() { return text; }
    public void setText(String text) { this.text = text; }
    public String getTokenizer() { return tokenizer; }
    public void setTokenizer(String tokenizer) { this.tokenizer = tokenizer; }
    public Integer getMaxTokens() { return maxTokens; }
    public void setMaxTokens(Integer maxTokens) { this.maxTokens = maxTokens; }
}
