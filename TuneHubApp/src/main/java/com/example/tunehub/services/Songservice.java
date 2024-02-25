package com.example.tunehub.services;

import java.util.List;

import com.example.tunehub.entities.Song;

public interface Songservice {

	String addSongs(Song song);
	
	public boolean songExits(String name);
	public List<Song> fetchAllSongs();

	
	
	public void updateSong(Song song) ;
		
		
	

}
