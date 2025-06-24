package com.nuach_server.ollama;

public record OllamaInput(
        String model,
        String prompt,
        boolean stream
) {
}
