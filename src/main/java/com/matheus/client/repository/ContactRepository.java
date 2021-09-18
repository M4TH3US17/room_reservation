package com.matheus.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheus.client.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
