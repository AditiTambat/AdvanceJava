package com.penguin_publications.Pune_publication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class PunePublicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(PunePublicationApplication.class, args);
	}

}
