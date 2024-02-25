package com.example.tunehub.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.tunehub.entities.Playlist;
import com.example.tunehub.entities.Song;
import com.example.tunehub.services.PlayListService;
import com.example.tunehub.services.Songservice;

@Controller
public class PlayListcontroller {
	
	@Autowired
	PlayListService pserv;
	
	@Autowired
	Songservice sserv;
	
	@GetMapping("/createplaylist")
	public String createPlayList(Model model) {
		
		List<Song> songslist=sserv.fetchAllSongs();
		
		model.addAttribute("songslist",songslist);
		
		return "createplaylist";
	}
	@PostMapping("/addplaylist")
	public String addPlayList(@ModelAttribute Playlist playlist) {
		
		pserv.addPlaylist(playlist);
		
		List<Song> songsList=playlist.getSongs();
		for(Song song : songsList) {
			song.getPlaylist().add(playlist);
			sserv.updateSong(song);
			
		}
		return "playlistsuccess";
	}
	@GetMapping("/viewplaylists")
	public String viewPlayList(Model model) {
		
		List<Playlist> plist=pserv.fetchPlaylists();
		model.addAttribute("plist", plist);
		
		return "viewplaylists";
	}

}
