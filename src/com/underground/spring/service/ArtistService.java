package com.underground.spring.service;

import java.util.List;

import com.underground.spring.entity.Artist;

public interface ArtistService {
	
	public List<Artist> getArtists();
	
	public void saveArtist(Artist theArtist);

	public Artist getArtist(int theId);
	
	public void deleteArtist(int theId);
}
