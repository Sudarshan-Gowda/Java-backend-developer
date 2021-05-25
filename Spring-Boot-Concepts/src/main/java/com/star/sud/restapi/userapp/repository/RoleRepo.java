package com.star.sud.restapi.userapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.star.sud.restapi.userapp.entity.Role;

public interface RoleRepo extends JpaRepository<Role, Long> {

}
