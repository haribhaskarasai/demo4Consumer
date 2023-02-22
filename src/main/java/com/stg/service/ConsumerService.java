package com.stg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.stg.module.Employee;

@Service
public class ConsumerService {
	@Autowired
	private RestTemplate restTemplate;
	
	public Employee getProducerData(int passId) {
		return restTemplate.getForObject ("http://localhost:3939/api/readbyid/" + passId ,Employee.class);
	}

}
