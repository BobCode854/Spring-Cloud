package com.code.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ShoppingController 
{
	@Autowired
	private RestTemplate template;
	
	@GetMapping("/amazon-payment")
	public String invokePaymentService() {
        String url = "http://PAYMENT-SERVICE/payment-provider/paynow ";
        /**
         *    **) As I am using @LoadBalanced on RestTemplate object creation . 
         *    **) I need to mandatorily give service name while calling microservice.(PAYMENT-SERVICE)
         *    **) Else we will get error like , "No instances available for localhost".
         */
        return template.getForObject(url, String.class);
	}
}
