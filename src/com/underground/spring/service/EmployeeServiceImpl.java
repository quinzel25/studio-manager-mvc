package com.underground.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.underground.spring.dao.EmployeeDAO;
import com.underground.spring.entity.Employee;



@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDAO employeeDAO;
	
	@Override
	@Transactional
	public List<Employee> getEmployees() {
		
		return employeeDAO.getEmployees();
	}
	
}
