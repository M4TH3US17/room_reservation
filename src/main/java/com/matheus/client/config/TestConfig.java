package com.matheus.client.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.matheus.client.entities.Address;
import com.matheus.client.entities.Bedroom;
import com.matheus.client.entities.Client;
import com.matheus.client.entities.Contact;
import com.matheus.client.entities.Location;
import com.matheus.client.entities.Payment;
import com.matheus.client.entities.Reservation;
import com.matheus.client.repository.AddressRepository;
import com.matheus.client.repository.BedroomRepository;
import com.matheus.client.repository.ClientRepository;
import com.matheus.client.repository.ContactRepository;
import com.matheus.client.repository.LocationRepository;
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
    @Autowired
    private LocationRepository locationRepository;
    @Autowired
    private AddressRepository addressRepository;
    
	@Override
	public void run(String... args) throws Exception { //RESERVA 1 E 2: MATHEUS
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
		
		Address a1 = new Address(null, "av. sama??ma", "SPA, Galil??ia", null);
		Address a2 = new Address(null, "Rua Dom Pedro I", null, null);
		Address a3 = new Address(null, "av. Marqu??s de Pombal", "Hospital Get??lio Vargas", null);
		addressRepository.saveAll(Arrays.asList(a1, a2, a3));
		
		Location l1 = new Location(null, "AM", "Cidade Nova", "Manaus", a1);
		a1.setLocation(l1);
		Location l2 = new Location(null, "AM", "Centro", "Itacoatiara", a2);
		a2.setLocation(l2);
		Location l3 = new Location(null, "TO", "Centro", "Palmas", a3);
		a3.setLocation(l3);
		locationRepository.saveAll(Arrays.asList(l1, l2, l3));
		addressRepository.saveAll(Arrays.asList(a1, a2, a3));
		
		Bedroom b1 = new Bedroom(null, 300.00, 'n', "", "3 quartos e 1 banheiro.", l1, r1);
		Bedroom b2 = new Bedroom(null, 500.00, 'n', "", "4 quartos, 1 banheiro e uma sala de estar.", l1, r2);
		Bedroom b3 = new Bedroom(null, 200.00, 'n', "", "1 quarto e 1 banheiro.", l2, r3);
		Bedroom b4 = new Bedroom(null, 250.00, 'n', "", "1 quarto e 2 banheiros", l3, r1);
		Bedroom b5 = new Bedroom(null, 800.00, 'y', "", "2 quarto e 2 banheiros", l3, null);
		bedroomRepository.saveAll(Arrays.asList(b1, b2, b3, b4, b5));
		
		r2.getList().add(b2);
		r3.getList().add(b3);
		r1.getList().add(b1);
		r1.getList().add(b4);
		
		reservationRepository.saveAll(Arrays.asList(r1, r2, r3));	
		
		Payment pay1 = new Payment(null, Instant.parse("2021-09-17T15:01:12Z"), r1);
		r1.setPayment(pay1);
		
		reservationRepository.save(r1);
	}	
}
