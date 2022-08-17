package com.underground.spring.service;

import java.util.List;

import com.underground.spring.entity.Gear;

public interface GearService {

	public List<Gear> getGears();
	
	public void saveGear(Gear theGear);

	public Gear getGear(int theId);
	
	public void deleteGear(int theId);
}
