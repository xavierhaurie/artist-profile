package com.artistprofile.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication(scanBasePackages = "com.artistprofile")
public class ArtistProfileApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArtistProfileApplication.class, args);
	}

}
