package com.nuach_server.quiz;

import com.nuach_server.ollama.Ollama;
import com.nuach_server.ollama.OllamaInput;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/quiz/")
public class QuizController {
    private final Ollama ollama;

    public QuizController(Ollama ollama) {
        this.ollama = ollama;
    }

    @PostMapping("request-question")
    public String requestQuestion(@RequestBody OllamaInput input) {
        return ollama.getPrompt(input);
    }
}
