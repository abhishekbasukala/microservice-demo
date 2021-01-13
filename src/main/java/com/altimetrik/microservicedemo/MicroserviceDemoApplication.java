package com.altimetrik.microservicedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MicroserviceDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceDemoApplication.class, args);
	}

}
