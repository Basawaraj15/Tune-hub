package com.example.tunehub.repositries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tunehub.entities.Playlist;


public interface PlayListrepository extends  JpaRepository<Playlist,Integer>{

}
