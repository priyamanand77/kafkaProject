package com.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.model.Employee;
import com.kafka.service.ProducerService;

import reactor.core.publisher.Mono;

@RestController
public class ProducerController {

	@Autowired
	private ProducerService ser;

	@PostMapping("/send")
	public Mono<Employee> sendMsg(@RequestBody Employee e) {
		Mono<Employee> e2 = Mono.just(e);
		ser.sendMessagesToConsumer(e);
		return e2;
	}

}
