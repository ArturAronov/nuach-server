package com.nuach_server.quiz;

import com.nuach_server.ollama.Ollama;
import com.nuach_server.ollama.OllamaInput;
import com.nuach_server.ollama.OllamaInstructions;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/quiz/")
public class QuizController {
    private final Ollama ollama;
    private final OllamaInstructions ollamaInstructions;

    public QuizController(Ollama ollama, OllamaInstructions ollamaInstructions) {
        this.ollama = ollama;
        this.ollamaInstructions = ollamaInstructions;
    }

    private OllamaInput getOllamaQuery(String query){
        return OllamaInput.createInput("llama3.2", query);
    }

    @PostMapping("submit-answer/")
    public FeedbackWithAnswerOutput submitAnswer(@RequestBody AnswerInput input) {
        OllamaInput feedbackQuery = getOllamaQuery(
                ollamaInstructions.getAnswerFeedback(input.question(), input.answer())
        );

        OllamaInput answerQuery = getOllamaQuery(
                ollamaInstructions.getAnswerPrompt(input.topic())
        );

        String ollamaFeedback = ollama.getPrompt(feedbackQuery);
        String ollamaQuestion = ollama.getPrompt(answerQuery);

        return FeedbackWithAnswerOutput.getOutput(ollamaFeedback, ollamaQuestion);
    }

    @GetMapping("request-question/")
    public String requestQuestion(@RequestParam String query) {
        OllamaInput answerQuery = getOllamaQuery(ollamaInstructions.getAnswerPrompt(query));

        return ollama.getPrompt(answerQuery);
    }
}
