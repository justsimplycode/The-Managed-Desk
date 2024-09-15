package com.shaswat.userservice.service;

import java.util.List;


import com.shaswat.userservice.exception.UserException;
import com.shaswat.userservice.model.User;

public interface UserService {

	public User findUserProfileByJwt(String jwt) throws UserException;
	
	public User findUserByEmail(String email) throws UserException;
	
	public User findUserById(Long userId) throws UserException;

	public List<User> findAllUsers();

//	public List<User> getPenddingRestaurantOwner();

//	void updatePassword(User user, String newPassword);

//	void sendPasswordResetEmail(User user);
}
