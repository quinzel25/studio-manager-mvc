package com.underground.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.underground.spring.dao.ContactDAO;
import com.underground.spring.entity.Contact;


@Service
public class ContactServiceImpl implements ContactService{
	
	@Autowired
	private ContactDAO contactDAO;
	
	@Override
	@Transactional
	public void saveContact(Contact theContact) {
		contactDAO.saveContact(theContact);
		
	}
		
	
}
