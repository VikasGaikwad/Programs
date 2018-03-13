package com.mvc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.mvc.model.UserDetails;

public class UserDetailsDaoImpl {
@Autowired 
private JdbcTemplate jdbcTemplate;
@Transactional
public UserDetails getUserDetails(int id) {
	return null;
	
}

}
