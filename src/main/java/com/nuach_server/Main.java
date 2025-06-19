package com.nuach_server;

import com.nuach_server.llm.Ollama;
import com.nuach_server.llm.OllamaInput;
import org.springframework.web.bind.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class Main {
	private Ollama ollama;

	public Main(Ollama ollama) {
		this.ollama = ollama;
	}

	@GetMapping("/")
	public String Test(@ModelAttribute OllamaInput input) {
		System.out.println(input.prompt());
		return ollama.getPrompt(input);
	}

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

}
