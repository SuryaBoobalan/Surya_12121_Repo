package com.ebs.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.ebs.model.User;
import com.ebs.repository.UserRepo;


@RestController
@CrossOrigin("http://localhost:3000/")
public class UserController {
	

	@Autowired
	UserRepo urepo;
	
	@PostMapping("/User")
	public String doInsert(@RequestBody User u) {
		urepo.save(u);
		return "User Saved Successfully";
	}
	
	@GetMapping("/User")
	public List<User> doFind() {
		return urepo.findAll();
	}

	
}
