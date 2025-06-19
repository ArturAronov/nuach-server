package com.nuach_server.llm;

import java.math.BigInteger;

public record OllamaOutput(
        String model,
        String created_at,
        String response,
        Boolean done,
        String done_reason,
        BigInteger[]  context,
        BigInteger total_duration,
        BigInteger load_duration,
        BigInteger prompt_eval_count,
        BigInteger prompt_eval_duration,
        BigInteger eval_count,
        BigInteger eval_duration
) {
}
