package com.star.sud.restapi.userapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.star.sud.restapi.userapp.entity.User;

public interface UserRepo extends JpaRepository<User, Long> {

}
