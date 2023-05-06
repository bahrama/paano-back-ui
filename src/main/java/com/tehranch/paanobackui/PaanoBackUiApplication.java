package com.tehranch.paanobackui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PaanoBackUiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaanoBackUiApplication.class, args);
	}

}
