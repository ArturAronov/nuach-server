package com.nuach_server;

import org.springframework.web.bind.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class Main {
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

}
