package com.matheus.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheus.client.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {

}
