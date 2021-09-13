package com.matheus.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheus.client.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
