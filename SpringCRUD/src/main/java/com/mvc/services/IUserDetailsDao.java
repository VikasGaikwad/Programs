package com.mvc.services;

import java.util.List;

import com.mvc.model.UserDetails;

public interface IUserDetailsDao {
	public UserDetails getUserDetails(int id);

	public List<UserDetails> getAllUserDetails();

	public int addUserDetails(UserDetails userDetails);

	public int updateUserDetails(UserDetails userDetails);

	public int deleteUserDetails(int id);


}
