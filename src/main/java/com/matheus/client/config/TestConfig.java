package com.matheus.client.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.matheus.client.entities.Bedroom;
import com.matheus.client.repository.BedroomRepository;

@Configuration
@Profile("teste")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private BedroomRepository repository;

	@Override
	public void run(String... args) throws Exception {
		Bedroom obj = new Bedroom(1L, 300.00, 'n', "3 quartos e 1 banheiro");
		repository.save(obj);
	}
	
	

}
