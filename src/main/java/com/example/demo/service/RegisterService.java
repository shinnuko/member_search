package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.RegisterRepository;
import com.example.demo.dto.RegisterprocessDto;

@Service
@Transactional

public class RegisterService {
	 @Autowired
	 RegisterRepository registerRepository;
	 @Autowired
	 PasswordEncoder passwordEncoder;

	 public RegisterprocessDto  create(RegisterprocessDto  registerprocessDto , String rawPassword) {
		 String encodedPassword = passwordEncoder.encode(rawPassword);
	        registerprocessDto.setPassword(encodedPassword);
	        return registerRepository.save(registerprocessDto);
	    }


}