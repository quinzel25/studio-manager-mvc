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



import com.underground.spring.entity.Artist;
import com.underground.spring.service.ArtistService;





@Controller
@RequestMapping("/artist")
public class ArtistController {
	
	@Autowired
	private ArtistService artistService;
	
	@GetMapping("/list")
	public String listArtists(Model theModel) {
		List<Artist> theArtists = artistService.getArtists();
		
		theModel.addAttribute("artists", theArtists);
		
		return "artist";
	}
	
	
	
	
	@GetMapping("/addArtistForm")
	public String addArtistForm(Model theModel) {
		
		Artist theArtist = new Artist();
		
		theModel.addAttribute("artist",theArtist);
		
		return "artist-form";
		
	}
	
	@PostMapping("/saveArtist")
	public String saveArtist(@ModelAttribute("artist") Artist theArtist) {
		artistService.saveArtist(theArtist);
		
		return "redirect:/artist/list";
	}
	
	@GetMapping("/updateArtistForm")
	public String updateArtistForm(@RequestParam("artistId") int theId, Model theModel) {
		
		Artist theArtist = artistService.getArtist(theId);
		
		theModel.addAttribute("artist", theArtist);
		
		return "artist-form";
	
	}
	
	@GetMapping("/delete")
	public String deleteArtist(@RequestParam("artistId") int theId) {
		
		artistService.deleteArtist(theId);
		
		return "redirect:/artist/list";
	}
	
	
}
