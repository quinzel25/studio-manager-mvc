package com.underground.spring.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.underground.spring.entity.Gear;
import com.underground.spring.service.GearService;

@Controller
@RequestMapping("/gear")
public class GearController {
	@Autowired
	private GearService gearService;
	
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	
	
	@GetMapping("/list")
	public String listGears(Model theModel) {
		List<Gear> theGears = gearService.getGears();
		
		theModel.addAttribute("gears", theGears);
		
		return "gear";
	}
	
	@GetMapping("/addGearForm")
	public String addGearForm(Model theModel) {
		
		Gear theGear = new Gear();
		
		theModel.addAttribute("gear",theGear);
		
		return "gear-form";
		
	}
	
	@PostMapping("/saveGear")
	public String saveGear(@ModelAttribute("gear") Gear theGear) {
		gearService.saveGear(theGear);
		
		return "redirect:/gear/list";
	}
	
	@GetMapping("/updateGearForm")
	public String updateGearForm(@RequestParam("gearId") int theId, Model theModel) {
		
		Gear theGear = gearService.getGear(theId);
		
		theModel.addAttribute("gear", theGear);
		
		return "gear-form";
	
	}
	
	@GetMapping("/delete")
	public String deleteGear(@RequestParam("gearId") int theId) {
		
		gearService.deleteGear(theId);
		
		return "redirect:/gear/list";
	}
}
