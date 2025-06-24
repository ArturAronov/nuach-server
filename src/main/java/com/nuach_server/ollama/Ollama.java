package com.nuach_server.ollama;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class Ollama {
    WebClient webClient = WebClient.create("http://localhost:11434");

    public String getPrompt(OllamaInput input) {
        OllamaOutput response = webClient
                .post()
                .uri("/api/generate")
                .bodyValue(input)
                .retrieve()
                .bodyToMono(OllamaOutput.class)
                .block();

        return response.response();
    }
}
