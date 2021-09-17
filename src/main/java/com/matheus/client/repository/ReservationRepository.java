package com.matheus.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheus.client.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long>{

}
