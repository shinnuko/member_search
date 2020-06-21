package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.RegisterprocessDto;

@Service
@Transactional

public class RegisterService {
	 @Autowired
	 RegisterprocessDto registerprocessDto;
	 @Autowired
	 PasswordEncoder passwordEncoder;
	 
	 public RegisterprocessDto create(RegisterprocessDto account, String rawPassword) {
	        String encodedPassword = passwordEncoder.encode(rawPassword);
	        account.setPassword(encodedPassword);
	        return registerprocessDto.save(account);
	    }

}
