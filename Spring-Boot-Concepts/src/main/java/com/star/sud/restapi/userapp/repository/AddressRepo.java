package com.star.sud.restapi.userapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.star.sud.restapi.userapp.entity.Address;

public interface AddressRepo extends JpaRepository<Address, Long> {

}
