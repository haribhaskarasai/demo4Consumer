package com.stg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stg.module.Employee;
import com.stg.service.ConsumerService;

@RestController
@RequestMapping(value="consumer")
public class ConsumerController {
	@Autowired
	private ConsumerService consumerService;
	
	@GetMapping(value="consumeread/{alias}")
	public ResponseEntity<Employee>readFromProducer(@PathVariable ("alias") int data){
		Employee employee= consumerService.getProducerData(data);
		return new ResponseEntity<Employee>(employee,HttpStatus.SEE_OTHER);
	}

}
