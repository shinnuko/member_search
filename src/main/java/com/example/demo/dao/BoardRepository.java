package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.BoardDto;

public interface BoardRepository extends JpaRepository<BoardDto, Integer>{

}
