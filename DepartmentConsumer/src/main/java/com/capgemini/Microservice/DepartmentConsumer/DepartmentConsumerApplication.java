package com.capgemini.Microservice.DepartmentConsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//import springfox.documentation.swagger2.annotations.EnableSwagger2;
@SpringBootApplication
@EnableDiscoveryClient
//@EnableSwagger2

public class DepartmentConsumerApplication {
	private static final Logger LOGGER=LoggerFactory.getLogger(SpringApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DepartmentConsumerApplication.class, args);
		LOGGER.error("Message Logged at ERROR Level");
	 LOGGER.warn("Message Logged at WARN Level");
	 LOGGER.info("Message Logged at INFO Level");
	 LOGGER.debug("Message Logged at DEBUG Level");
	
	}
}
