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
@Table(name="artist")
public class Artist {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="bio")
	private String bio;
	
	@Column(name="photo")
	private String photo;
	
	// First step of many to many relationship
	@ManyToMany
	@JoinTable(name = "gear_has_artist", joinColumns = @JoinColumn(name = "artist_id"), inverseJoinColumns = @JoinColumn(name = "gear_id"))
	List<Gear> artistGears;


	
	
	

	public List<Gear> getArtistGears() {
		return artistGears;
	}

	public void setArtistGears(List<Gear> artistGears) {
		this.artistGears = artistGears;
	}

	public Artist() {
	
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "Artist [id=" + id + ", name=" + name + ", email=" + email + ", bio=" + bio + ", photo=" + photo + "]";
	}
	
	
	
	
}
