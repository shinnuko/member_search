package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Register;
import com.example.demo.dto.RegisterprocessDto;


public interface RegisterRepository extends JpaRepository<RegisterprocessDto, Integer> {

	Register  findByName(String name);

}