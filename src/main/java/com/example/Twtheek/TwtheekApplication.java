package com.example.Twtheek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EnableAutoConfiguration
public class TwtheekApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwtheekApplication.class, args);
//		System.out.println(new BCryptPasswordEncoder().encode("123"));
	}

}
