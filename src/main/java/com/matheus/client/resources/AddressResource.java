package com.matheus.client.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.matheus.client.entities.Address;
import com.matheus.client.services.AddressService;

@Controller
@RequestMapping(value = "/adresses")
public class AddressResource {

	@Autowired
	private AddressService service;

	@GetMapping
	public ResponseEntity<List<Address>> findAll() {
		List<Address> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Address> findById(@PathVariable Long id) {
		Address obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
