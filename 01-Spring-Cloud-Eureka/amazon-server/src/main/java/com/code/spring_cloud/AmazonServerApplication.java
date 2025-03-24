package com.code.spring_cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
/**
 *  --> Adding this Spring will understand as a Eureka Server. 
 *  --> Also with this We are enable the Eureka Server port for other microservices to register themself here.
 */
public class AmazonServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmazonServerApplication.class, args);
	}

}
