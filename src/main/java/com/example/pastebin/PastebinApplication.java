package com.example.pastebin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.example.pastebin")
public class PastebinApplication {

	public static void main(String[] args) {

		SpringApplication.run(PastebinApplication.class, args);
	}

}
