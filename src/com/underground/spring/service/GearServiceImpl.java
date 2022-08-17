package com.underground.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import com.underground.spring.dao.GearDAO;
import com.underground.spring.entity.Gear;

@Service
public class GearServiceImpl implements GearService {
	
	@Autowired
	private GearDAO gearDAO;
	
	@Override
	@Transactional
	public List<Gear> getGears() {
		
		return gearDAO.getGears();
	}

	@Override
	@Transactional
	public void saveGear(Gear theGear) {
		gearDAO.saveGear(theGear);
		
	}

	@Override
	@Transactional
	public Gear getGear(int theId) {
		
		return gearDAO.getGear(theId);
	}

	@Override
	@Transactional
	public void deleteGear(int theId) {
		gearDAO.deleteGear(theId);
		
	}

}
