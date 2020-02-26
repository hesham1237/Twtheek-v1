package com.example.Twtheek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration
public class TwtheekApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwtheekApplication.class, args);
	}

}
