package com.code.config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
class InsuranceConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(InsuranceConfigServerApplication.class, args);
	}

}
