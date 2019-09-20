package com.demo.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Hashtable;
import com.demo.model.User;

@Service("UserService")
public class UserServiceImpl implements UserService {

	HashMap<String,User> users = new HashMap<String, User>();
	
	@Override
	public HashMap<String, User> getAll() {
		// TODO Auto-generated method stub
		User u= new User();
		u.setId("1");
		u.setName("Alexa");
		u.setAcc_no("123");
		u.setAcc_bal(1000);
		users.put("1",u);
		
		u= new User();
		u.setId("2");
		u.setName("Mike");
		u.setAcc_no("124");
		u.setAcc_bal(1000);
		users.put("2",u);
		return users;
	}

	@Override
	public User getUser(String id) {
		// TODO Auto-generated method stub
		User u= new User();
		u.setId("1");
		u.setName("Alexa");
		u.setAcc_no("123");
		u.setAcc_bal(1000);
		users.put("1",u);
		
		u= new User();
		u.setId("2");
		u.setName("Mike");
		u.setAcc_no("124");
		u.setAcc_bal(1000);
		users.put("2",u);
		if(users.containsKey(id))
			return users.get(id);
		else
			return null;
	}
	
}
