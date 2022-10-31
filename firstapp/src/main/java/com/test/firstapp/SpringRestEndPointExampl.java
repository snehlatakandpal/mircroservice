package com.test.firstapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class SpringRestEndPointExampl {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestEndPointExampl.class, args);
	}
}
