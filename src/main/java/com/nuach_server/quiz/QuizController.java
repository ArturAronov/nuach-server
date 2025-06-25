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

    @GetMapping("request-question/")
    public String requestQuestion(@RequestParam String query) {
        OllamaInput ollamaObj = new OllamaInput(
                "llama3.2",
                ollamaInstructions.getAnswerPrompt(query),
                false
            );

        return ollama.getPrompt(ollamaObj);
    }
}
