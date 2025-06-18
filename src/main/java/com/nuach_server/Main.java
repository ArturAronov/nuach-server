package com.nuach_server;

import com.nuach_server.llm.Ollama;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
public class Main {
	Ollama ollama;

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

}
