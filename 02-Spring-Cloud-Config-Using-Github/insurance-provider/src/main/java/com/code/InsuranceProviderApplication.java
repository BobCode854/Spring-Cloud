package com.code;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/insurance-provider")
public class InsuranceProviderApplication {
	
	@GetMapping("/getAllPlans")
	 public List<String> getAllPlans(){
		return Stream.of("Gold","Plantinum","Premium").collect(Collectors.toList());
	}

	public static void main(String[] args) {
		SpringApplication.run(InsuranceProviderApplication.class, args);
	}

}
