package com.nuach_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Main {

	@RequestMapping("/")
	public String helloz() {
		return "I'm ALIVE!!!!!!!!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

}
