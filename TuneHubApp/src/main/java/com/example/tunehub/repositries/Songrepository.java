package com.example.tunehub.repositries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tunehub.entities.Song;



public interface Songrepository extends JpaRepository<Song,Integer>{
	public Song findByName(String name);
}
