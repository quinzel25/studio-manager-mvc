package com.underground.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.underground.spring.entity.Contact;
import com.underground.spring.service.ContactService;



@Controller
@RequestMapping("/contact")
public class ContactController {

	@Autowired
	private ContactService contactService;
	
	@GetMapping("/addContactForm")
	public String addContactForm(Model theModel) {
		
		Contact theContact = new Contact();
		
		theModel.addAttribute("contact",theContact);
		
		return "contact-form";
		
	}
	
	@PostMapping("/saveContact")
	public String saveContact(@ModelAttribute("contact") Contact theContact) {
		contactService.saveContact(theContact);
		
		return "redirect:/underground-pine/home";
	}
	
}
