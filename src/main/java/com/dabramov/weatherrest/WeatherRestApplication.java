package com.dabramov.weatherrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class WeatherRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherRestApplication.class, args);
	}

}
