package com.matheus.client.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.matheus.client.entities.Bedroom;
import com.matheus.client.entities.Client;
import com.matheus.client.entities.Contact;
import com.matheus.client.entities.Reservation;
import com.matheus.client.repository.BedroomRepository;
import com.matheus.client.repository.ClientRepository;
import com.matheus.client.repository.ContactRepository;
import com.matheus.client.repository.ReservationRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private BedroomRepository bedroomRepository;
	@Autowired
	private ClientRepository clientRepository;
    @Autowired
    private ReservationRepository reservationRepository;
    @Autowired
    private ContactRepository contactRepository;
    
	@Override
	public void run(String... args) throws Exception {
	    Client c1 = new Client(null, "Matheus Dalvino", null);
		Client c2 = new Client(null, "Pedro Almeida", null);
		clientRepository.saveAll(Arrays.asList(c1, c2));
		
		Contact co1 = new Contact(null, "matheusdalvino50@gmail.com", "(92) 99252-3306", c1);
		c1.setContact(co1);
		contactRepository.saveAll(Arrays.asList(co1));
		clientRepository.saveAll(Arrays.asList(c1, c2));
	
		Reservation r1 = new Reservation(null, Instant.parse("2021-09-17T13:00:11Z"), Instant.parse("2021-09-28T15:00:11Z"), c1);
		Reservation r2 = new Reservation(null, Instant.parse("2021-09-17T13:00:11Z"), Instant.parse("2021-09-28T15:00:11Z"), c1);
		Reservation r3 = new Reservation(null, Instant.parse("2021-08-17T13:00:11Z"), Instant.parse("2021-09-19T15:00:11Z"), c2);
		
		c1.getList().add(r1);
		c1.getList().add(r2);
		c2.getList().add(r3);
		reservationRepository.saveAll(Arrays.asList(r1, r2, r3));	
		clientRepository.saveAll(Arrays.asList(c1, c2));
		
		Bedroom b1 = new Bedroom(null, 300.00, 'y', "", "3 quartos e 1 banheiro.", r1);
		Bedroom b2 = new Bedroom(null, 500.00, 'n', "", "4 quartos, 1 banheiro e uma sala de estar.", r2);
		Bedroom b3 = new Bedroom(null, 200.00, 'n', "", "1 quarto e 1 banheiro.", r3);
		Bedroom b4 = new Bedroom(null, 200.00, 'n', "", "1 quarto e 2 banheiros", null);
		bedroomRepository.saveAll(Arrays.asList(b1, b2, b3, b4));
		
		r1.getList().add(b1);
		r2.getList().add(b2);
		r3.getList().add(b3);
		
		reservationRepository.saveAll(Arrays.asList(r1, r2, r3));	
		
	}	

}
