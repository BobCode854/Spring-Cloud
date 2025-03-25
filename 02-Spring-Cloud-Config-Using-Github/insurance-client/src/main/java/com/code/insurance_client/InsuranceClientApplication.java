package com.code.insurance_client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
@RefreshScope  /** This annotation will help to refresh the updated api If changes in provider */
public class InsuranceClientApplication {

	@Autowired
	RestTemplate restTemplate;
	
	/**     If circular dependency will come . 
	 *   ===================================================   
	 *    --) we can either create other config file and  create the bean over there
	 *    --) or we can annotate @Lazy
	 * */
	
	@Value("${insurance.provider.url}")
	private String url;
	
	@GetMapping("/getPlansFromClient")
	public List<String> getPlans(){
		List<String> plans = restTemplate.getForObject(url, List.class);
		return plans;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(InsuranceClientApplication.class, args);
	}

}
