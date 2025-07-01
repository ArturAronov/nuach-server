package com.nuach_server.quiz;

public record FeedbackWithAnswerOutput(
   String feedback,
   String question
) {
    public static FeedbackWithAnswerOutput getOutput(String feedback, String question) {
        return new FeedbackWithAnswerOutput(feedback, question);
    }
}
