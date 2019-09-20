package com.demo.service;

import java.util.HashMap;
import java.util.Hashtable;

import com.demo.model.User;

public interface UserService {
	
	public HashMap<String, User> getAll();
	
	public User getUser(String id);

}
