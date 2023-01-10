package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.repository.PersonRepository;

@Component
public class TestComponent implements CommandLineRunner {

	@Autowired
	private PersonRepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.findAll();
		System.out.println(repository.findAll());
		System.out.println(repository.getName());
	}

}
