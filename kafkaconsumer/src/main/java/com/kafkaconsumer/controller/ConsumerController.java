package com.kafkaconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.model.Employee;
import com.kafkaconsumer.service.KsfksConsumer;

@RestController
public class ConsumerController {

	@Autowired
	private KsfksConsumer ser;
	
	@GetMapping("/get")
	public Employee getAll()
	{
		return ser.getEmp();
	}
}
