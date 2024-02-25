package com.example.tunehub.repositries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tunehub.entities.Users;

public interface UserRepository extends JpaRepository<Users,Integer>{

	public Users findByEmail(String email);

	

}
