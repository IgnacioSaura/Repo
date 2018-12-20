package com.globant.bootcamp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globant.bootcamp.User;
import com.globant.bootcamp.repository.UserRepository;
@Service
public class UserDAO {
	@Autowired
private UserRepository userRepository;
	
	public User save(User u) {
		return userRepository.save(u);
	}
	
	public List <User> findAll(){
		return userRepository.findAll();
	}
	public User findOne(long uid) {
		return userRepository.findOne(uid);
	}
	public void delete(User u) {
		userRepository.delete(u);
	}
}
