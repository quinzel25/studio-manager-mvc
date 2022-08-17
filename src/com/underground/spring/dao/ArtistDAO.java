package com.underground.spring.dao;

import java.util.List;

import com.underground.spring.entity.Artist;



public interface ArtistDAO {
	public List<Artist> getArtists();
	
	public void saveArtist(Artist theArtist);

	public Artist getArtist(int theId);
	
	public void deleteArtist(int theId);
}
