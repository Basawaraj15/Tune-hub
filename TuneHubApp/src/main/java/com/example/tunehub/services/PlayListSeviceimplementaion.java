package com.example.tunehub.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tunehub.entities.Playlist;
import com.example.tunehub.entities.Song;
import com.example.tunehub.repositries.PlayListrepository;
@Service
public class PlayListSeviceimplementaion implements PlayListService{
	
	@Autowired
	PlayListrepository prepo;

	@Override
	public void addPlaylist(Playlist playlist) {
		// TODO Auto-generated method stub
		prepo.save(playlist);
	}
	@Override
	public List<Playlist> fetchPlaylists(){
		return prepo.findAll();
	}

}
