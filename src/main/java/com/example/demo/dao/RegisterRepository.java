package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Register;


public interface RegisterRepository extends JpaRepository<Register, Integer> {

	Register  findByName(String name);

}