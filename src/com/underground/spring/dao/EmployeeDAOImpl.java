package com.underground.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.underground.spring.entity.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;
			
	@Override
	@Transactional
	public List<Employee> getEmployees() {
		System.out.println("call 1");
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		System.out.println("call 2");		
		// create a query
		Query<Employee> theQuery = 
				currentSession.createQuery("from Employee", Employee.class);
		System.out.println("call 3");
		// execute query and get result list
		List<Employee> employees = theQuery.getResultList();
				System.out.println(employees);
		// return the results		
		return employees;
	}

}
