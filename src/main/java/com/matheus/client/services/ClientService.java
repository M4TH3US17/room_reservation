package com.matheus.client.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.matheus.client.entities.Client;
import com.matheus.client.repository.ClientRepository;
import com.matheus.client.services.exceptions.DatabaseException;
import com.matheus.client.services.exceptions.ResourceNotFoundException;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;
	
	public List<Client> findAll(){
		return repository.findAll();
	}
	
	public Client findById(Long id) {
		Optional<Client> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public Client insert(Client obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		try {
		   	repository.deleteById(id);
		} catch(DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		} catch(EmptyResultDataAccessException e2) {
			throw new ResourceNotFoundException(id);
		}
	}
	
	public Client update(Long id, Client obj) {
		try {
		Client entity = repository.getById(id);
		updateData(entity, obj);
		return repository.save(entity);
		} catch(EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}
	}

	private void updateData(Client entity, Client obj) {
		entity.setName(obj.getName());	
		if(entity.getContact() == null) {	
		    	entity.setContact(obj.getContact());
		} else {
			entity.getContact().setEmail(obj.getContact().getEmail());
			entity.getContact().setNumber(obj.getContact().getNumber());
		}
		}		
}
