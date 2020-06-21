package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.RegisterprocessDto;

@Repository
public interface RegisterRepository extends JpaRepository<RegisterprocessDto, Integer> {
}