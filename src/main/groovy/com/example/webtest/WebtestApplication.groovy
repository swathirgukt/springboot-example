package com.example.webtest

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping

@SpringBootApplication
class WebtestApplication {

	static void main(String[] args) {
		SpringApplication.run WebtestApplication, args
	}
}
