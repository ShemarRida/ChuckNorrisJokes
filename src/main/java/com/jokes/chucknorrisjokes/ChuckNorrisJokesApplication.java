package com.jokes.chucknorrisjokes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
public class ChuckNorrisJokesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChuckNorrisJokesApplication.class);
	}

}
