package com.underground.spring.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import com.underground.spring.entity.Employee;
import com.underground.spring.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	// need to inject the customer dao
	@Autowired
	
	private EmployeeService employeeService;
	
	

	@RequestMapping("/about")
	public String showAbout(Model theModel2) {
		
		List<Employee> theEmployees = employeeService.getEmployees();
		
		
		// add the customers to the model
		theModel2.addAttribute("employees", theEmployees);
		System.out.println(theEmployees);
		return "about";
	}
	
}