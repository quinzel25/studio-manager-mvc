package com.underground.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.underground.spring.dao.ArtistDAO;
import com.underground.spring.entity.Artist;

@Service
public class ArtistServiceImpl implements ArtistService {

	@Autowired
	private ArtistDAO artistDAO;
	
	@Override
	@Transactional
public List<Artist> getArtists() {
		//calls and returns the DAO methods
		return artistDAO.getArtists();
	}

	@Override
	@Transactional
	public void saveArtist(Artist theArtist) {
		artistDAO.saveArtist(theArtist);
		
	}

	@Override
	@Transactional
	public Artist getArtist(int theId) {
		
		return artistDAO.getArtist(theId);
	}

	@Override
	@Transactional
	public void deleteArtist(int theId) {
		artistDAO.deleteArtist(theId);
		
	}
	
	
}
