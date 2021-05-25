package com.star.sud.restapi.userapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.star.sud.restapi.userapp.dto.UserDto;
import com.star.sud.restapi.userapp.service.ITransactionService;

@RestController
public class TransactionController {

	@Autowired
	private ITransactionService service;

	@GetMapping("/users")
	public ResponseEntity<?> getAllUsers() {
		return service.getAllUsers();
	}

	@PostMapping("/users")
	public ResponseEntity<?> createUser(@RequestBody UserDto user) {
		return service.createUser(user);
	}

	@PutMapping("/Users/{userId}")
	public ResponseEntity<?> updateUser(@PathVariable Long userId, @RequestBody UserDto user) throws Exception {
		return service.updateUser(userId, user);
	}

	@DeleteMapping("/users/{userId}")
	public ResponseEntity<?> deleteUser(@PathVariable Long userId) {
		return service.deleteUser(userId);
	}

}
