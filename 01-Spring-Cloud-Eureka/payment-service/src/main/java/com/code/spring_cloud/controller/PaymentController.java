package com.code.spring_cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment-provider")
public class PaymentController
{
	
	@GetMapping("/paynow")
	public String payNow() {
		return "payNow";
	}

}
