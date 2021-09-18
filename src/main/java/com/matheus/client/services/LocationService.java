package com.matheus.client.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matheus.client.entities.Location;
import com.matheus.client.repository.LocationRepository;

@Service
public class LocationService {

	@Autowired
	private LocationRepository repository;
	
	public List<Location> findAll(){
		return repository.findAll();
	}
	
	public Location findById(Long id) {
		Optional<Location> obj = repository.findById(id);
		return obj.get();
	}
}
