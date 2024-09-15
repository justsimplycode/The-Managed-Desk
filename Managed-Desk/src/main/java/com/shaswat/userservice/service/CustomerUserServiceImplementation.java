package com.shaswat.userservice.service;

import java.util.ArrayList;
import java.util.List;

import com.shaswat.userservice.model.User;
import com.shaswat.userservice.repository.UserRepository;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomerUserServiceImplementation implements UserDetailsService {


	private UserRepository userRepository;
	
	public CustomerUserServiceImplementation(UserRepository userRepository) {
		this.userRepository=userRepository;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User user = userRepository.findByEmail(username);
		
		if(user==null) {

			throw new UsernameNotFoundException("user not found with email  - "+username);
		}
		
		List<GrantedAuthority> authorities=new ArrayList<>();

		return new org.springframework.security.core.userdetails.User(
				user.getEmail(),user.getPassword(),authorities);
	}


}
