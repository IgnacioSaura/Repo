package com.globant.bootcamp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globant.bootcamp.User;
import com.globant.bootcamp.dao.UserDAO;

@RestController
@RequestMapping("/company")
public class UserController {
	@Autowired
	private UserDAO userDAO;

	@PostMapping("/users")
	public User createUser(@Valid @RequestBody User u) {
		return userDAO.save(u);

	}

	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userDAO.findAll();
	}

	@GetMapping("/users/{id}")
	public ResponseEntity<User> getUserById(@PathVariable(value = "id") long uid) {
		User u = userDAO.findOne(uid);
		if (u == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(u);

	}

	@PutMapping("/users/{id}")
	public ResponseEntity<User> updateUser(@PathVariable(value = "id") long uid, @Valid @RequestBody User userDetails) {
		User u = userDAO.findOne(uid);
		if (u == null) {
			return ResponseEntity.notFound().build();
		}
		u.setName(userDetails.getName());
		User updatedUser = userDAO.save(u);
		return ResponseEntity.ok().body(u);

	}
	@DeleteMapping("/users/{id}")
	public ResponseEntity<User> deleteUser(@PathVariable(value = "id") long uid){
		User u = userDAO.findOne(uid);
		if (u == null) {
			return ResponseEntity.notFound().build();
		}
		userDAO.delete(u);
		return ResponseEntity.ok().build();
	}
}
