 package com.example.tunehub.controller;


 import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.tunehub.entities.Song;
import com.example.tunehub.services.Songservice;


@Controller
public class Songscontroller {
	
	@Autowired
	Songservice songerv;
	

	@PostMapping("/addsongs")
public String addSongs(@ModelAttribute Song song ) {
		
		boolean status=songerv.songExits(song.getName());
		if(status==false) {
			songerv.addSongs(song);
			return "songsuccess";
		}
		else {
			return "songfail";
		}
		
}
	@GetMapping("/map-viewsongs")
	public String viewSongs(Model model) {
		List<Song> songslist=songerv.fetchAllSongs();
		model.addAttribute("songslist", songslist);
		
		return "displaysongs";
	}
	@GetMapping("/viewsongs")
	public String viewCustomerSong(Model model) {
		boolean primeCustomerStatus=true;
		if(primeCustomerStatus==true) {
			List<Song> songslist=songerv.fetchAllSongs();
			model.addAttribute("songslist", songslist);
			return "displaysongs";
		}
		else {
			return "makepayment";
		}
	}
}