package com.underground.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.underground.spring.entity.Artist;




@Repository
public class ArtistDAOImpl implements ArtistDAO{
	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;
		
	
	@Override
	public List<Artist> getArtists() {
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<Artist> theQuery = currentSession.createQuery("from Artist order by name", Artist.class);
		// execute query and get result list
		List<Artist> artists = theQuery.getResultList();
		// return the results	
		return artists;
	}
	
	@Override
	public void saveArtist(Artist theArtist) {
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		currentSession.saveOrUpdate(theArtist);
	}

	@Override
	public Artist getArtist(int theId) {
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		return currentSession.get(Artist.class, theId);
	}

	@Override
	public void deleteArtist(int theId) {
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query theQuery = currentSession.createQuery("delete from Artist where id=:artistId");
		theQuery.setParameter("artistId", theId);
		
		theQuery.executeUpdate();
	
	}
}
