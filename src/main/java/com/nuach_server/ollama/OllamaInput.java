package com.nuach_server.ollama;

public record OllamaInput(
        String model,
        String prompt,
        boolean stream
) {
    public static OllamaInput createInput(String model, String prompt) {
        return new OllamaInput(model, prompt, false);
    }
}
