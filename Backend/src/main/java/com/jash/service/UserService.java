package com.jash.service;

import java.util.List;

import com.jash.exception.UserException;
import com.jash.modal.Ride;
import com.jash.modal.User;


public interface UserService {
	
	public User createUser(User user) throws UserException;
	
	public User getReqUserProfile(String token) throws UserException;
	
	public User findUserById(Integer Id) throws UserException;
	
	public User findUserByEmail(String email) throws UserException;
	
	public User findUserByToken(String token) throws UserException;
	
	public List<Ride> completedRids(Integer userId) throws UserException;
	

}
