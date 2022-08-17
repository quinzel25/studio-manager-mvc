package com.underground.spring.dao;

import java.util.List;


import com.underground.spring.entity.Gear;

public interface GearDAO {

	public List<Gear> getGears();
	
	public void saveGear(Gear theGear);

	public Gear getGear(int theId);
	
	public void deleteGear(int theId);
		
}
