package com.matheus.client.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tb_bedroom")
public class Bedroom implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Double value;
	private Character available;
	private String imgUrl;
	private String description;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "reservation_id", nullable = true)
	private Reservation reservation;

	@OneToOne
	@JoinColumn(nullable=false)
	private Location location;
	
	public Bedroom() {
	}

	public Bedroom(Long id, Double value, Character available, String imgUrl, String description, Location location, Reservation reservation) {
		if(available != 'y' && available != 'n') {
			throw new IllegalArgumentException("Available attribute is invalid");
		}
		this.id = id;
		this.value = value;
		this.imgUrl = imgUrl;
		this.available = available;
		this.location = location;
		this.reservation = reservation;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public Character getAvailable() {
		return available;
	}

	public void setAvailable(Character available) {
		this.available = available;
	}
	
	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bedroom other = (Bedroom) obj;
		return Objects.equals(id, other.id);
	}
	
}
