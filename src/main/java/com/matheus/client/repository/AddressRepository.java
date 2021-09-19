package com.matheus.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheus.client.entities.Address;

public interface AddressRepository extends JpaRepository<Address, Long>{

}
