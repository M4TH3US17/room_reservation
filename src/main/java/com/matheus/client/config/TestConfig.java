package com.matheus.client.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.matheus.client.entities.Bedroom;
import com.matheus.client.entities.Client;
import com.matheus.client.repository.BedroomRepository;
import com.matheus.client.repository.ClientRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private BedroomRepository bedroomRepository;
	@Autowired
	private ClientRepository clientRepository;

	@Override
	public void run(String... args) throws Exception {
		Bedroom b1 = new Bedroom(null, 300.00, 'n', "3 quartos e 1 banheiro.");
		Bedroom b2 = new Bedroom(null, 500.00, 'n', "4 quartos, 1 banheiro e uma sala de estar.");
		Bedroom b3 = new Bedroom(null, 200.00, 'n', "1 quarto e 1 banheiro.");
		
		Client c1 = new Client(null, "Matheus Dalvino", "(92) 00000-0000", Arrays.asList(b1, b2));
		Client c2 = new Client(null, "Pedro Almeida", "(92) 00000-0000", Arrays.asList(b3));
		
		b1.setClient(c1);
		b1.setClient(c1);
		b3.setClient(c2);
		
		clientRepository.saveAll(Arrays.asList(c2, c1));
		bedroomRepository.saveAll(Arrays.asList(b1, b2, b3));
	}	

}
