package com.spring.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.microservices.limitsservice.bean.LimitConfiguration;

@RestController
public class LimitConfigurationController {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping(path="/limits")
	public LimitConfiguration retreiveLimitsFromConfiguration() {
		return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
	}
	
}
