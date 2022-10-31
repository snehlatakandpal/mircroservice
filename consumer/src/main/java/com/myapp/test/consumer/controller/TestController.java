package com.myapp.test.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

	@Autowired
	RestTemplate restTemplate;
	
	 @RequestMapping(value = "/getProducts", method = RequestMethod.GET)
	public String getProducts() 
	  {		 
		 String hello = restTemplate.getForObject("http://producer/api/v1/products/", String.class);
		 return hello;
	  }
	 
	 @Bean
	  @LoadBalanced
	  public RestTemplate restTemplate(RestTemplateBuilder builder) {
	    return builder.build();
	  }
}
