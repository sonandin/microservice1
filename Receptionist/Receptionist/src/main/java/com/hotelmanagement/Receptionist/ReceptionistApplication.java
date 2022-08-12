package com.hotelmanagement.Receptionist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ReceptionistApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReceptionistApplication.class, args);
	}

}
