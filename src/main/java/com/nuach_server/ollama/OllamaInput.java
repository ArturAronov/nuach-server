package com.nuach_server.llm;

public record OllamaInput(
        String model,
        String prompt,
        boolean stream
) {
}
