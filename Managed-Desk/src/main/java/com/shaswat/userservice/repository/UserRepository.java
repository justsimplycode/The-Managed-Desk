package com.shaswat.userservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.shaswat.userservice.model.User;



public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByEmail(String email);

}
