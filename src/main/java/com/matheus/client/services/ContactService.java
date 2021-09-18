package com.matheus.client.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matheus.client.entities.Contact;
import com.matheus.client.repository.ContactRepository;

@Service
public class ContactService {

	@Autowired
	private ContactRepository repository;
	
	public List<Contact> findAll(){
		return repository.findAll();
	}
	
	public Contact findById(Long id) {
		Optional<Contact> obj = repository.findById(id);
		return obj.get();
	}
}
