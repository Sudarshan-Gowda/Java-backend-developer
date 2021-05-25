package com.star.sud.restapi.userapp.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.star.sud.restapi.userapp.dto.UserDto;
import com.star.sud.restapi.userapp.entity.User;
import com.star.sud.restapi.userapp.repository.UserRepo;
import com.star.sud.restapi.userapp.service.ITransactionService;

@Service
public class TransactionServiceImpl implements ITransactionService {

	private static Logger log = LogManager.getLogger(TransactionServiceImpl.class);

	@Autowired
	private UserRepo userRepo;

	@Override
	public ResponseEntity<List<UserDto>> getAllUsers() {
		log.info("getAllUsers");
		List<User> findAll = userRepo.findAll();

		List<UserDto> userDtos = new ArrayList<>();

		findAll.stream().forEach(user -> {

			UserDto updatedDto = new UserDto();
			BeanUtils.copyProperties(user, updatedDto);
			userDtos.add(updatedDto);

		});

		return new ResponseEntity<>(userDtos, HttpStatus.OK);

	}

	@Override
	public ResponseEntity<UserDto> createUser(UserDto dto) {
		log.info("createUser");
		User user = new User();
		user.setAddress(new HashSet<>());
		BeanUtils.copyProperties(dto, user);
		BeanUtils.copyProperties(dto.getAddress(), user.getAddress());
		User updatedEntity = userRepo.saveAndFlush(user);
		UserDto updatedDto = new UserDto();
		BeanUtils.copyProperties(updatedEntity, updatedDto);
		return new ResponseEntity<>(updatedDto, HttpStatus.CREATED);

	}

	@Override
	public ResponseEntity<UserDto> updateUser(Long userId, UserDto dto) throws Exception {
		log.info("createUser");

		User user = userRepo.findById(userId).orElseThrow(() -> new Exception("Record not found for id: " + userId));
		BeanUtils.copyProperties(dto, user, "userId");

		User updatedEntity = userRepo.saveAndFlush(user);
		UserDto updatedDto = new UserDto();
		BeanUtils.copyProperties(updatedEntity, updatedDto);
		return new ResponseEntity<>(updatedDto, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> deleteUser(Long userId) {
		log.info("deleteUser");
		userRepo.deleteById(userId);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}
