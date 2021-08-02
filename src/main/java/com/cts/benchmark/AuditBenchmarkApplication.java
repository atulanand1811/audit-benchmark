package com.cts.benchmark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
public class AuditBenchmarkApplication {
	/**
	 * main Method- Spring Boot's method to launch an application.
	 */
	public static void main(String[] args) {
		SpringApplication.run(AuditBenchmarkApplication.class, args);
	}

}
