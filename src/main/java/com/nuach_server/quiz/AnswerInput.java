package com.nuach_server.quiz;

public record AnswerInput(
        String question,
        String answer,
        String topic
) {
}
