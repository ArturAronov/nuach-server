package com.nuach_server.ollama;

public record OllamaOutput(
        String model,
        String created_at,
        String response,
        boolean done,
        String done_reason,
        long[]  context,
        long total_duration,
        long load_duration,
        long prompt_eval_count,
        long prompt_eval_duration,
        long eval_count,
        long eval_duration
) {
}
