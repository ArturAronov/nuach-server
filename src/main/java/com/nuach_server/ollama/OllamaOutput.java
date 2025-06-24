package com.nuach_server.llm;

public record OllamaOutput(
        String model,
        String created_at,
        String response,
        Boolean done,
        String done_reason,
        int[]  context,
        int total_duration,
        int load_duration,
        int prompt_eval_count,
        int prompt_eval_duration,
        int eval_count,
        int eval_duration
) {
}
