package com.star.sud.restapi.userapp.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.star.sud.restapi.userapp.dto.UserDto;

public interface ITransactionService {

	ResponseEntity<List<UserDto>> getAllUsers();

	ResponseEntity<UserDto> createUser(UserDto user);

	ResponseEntity<UserDto> updateUser(Long userId, UserDto dto) throws Exception;

	ResponseEntity<?> deleteUser(Long userId);

}
