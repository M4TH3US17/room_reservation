package com.matheus.client.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.matheus.client.entities.Contact;
import com.matheus.client.services.ContactService;

@Controller
@RequestMapping(value = "/contacts")
public class ContactResource {

	@Autowired
	private ContactService service;

	@GetMapping
	public ResponseEntity<List<Contact>> findAll() {
		List<Contact> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Contact> findById(@PathVariable Long id) {
		Contact obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
