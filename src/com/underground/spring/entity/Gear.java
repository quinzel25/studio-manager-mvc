package com.underground.spring.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="gear")
public class Gear {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="manufacturer")
	private String manufacturer;
	
	@Column(name="type")
	private String type;

	
	// First step of many to many relationship
	@ManyToMany
	@JoinTable(name = "gear_has_artist", joinColumns = @JoinColumn(name = "gear_id"), inverseJoinColumns = @JoinColumn(name = "artist_id"))
	List<Artist> gearArtists;
	
	
	
	public List<Artist> getGearArtists() {
		return gearArtists;
	}

	public void setGearArtists(List<Artist> gearArtists) {
		this.gearArtists = gearArtists;
	}

	public Gear() {
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Gear [id=" + id + ", name=" + name + ", manufacturer=" + manufacturer + ", type=" + type + "]";
	}
	
	
	
}
