package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.RegisterRepository;
import com.example.demo.dto.Register;
import com.example.demo.dto.RegisterprocessDto;

@Service
@Transactional

public class RegisterService {
	 @Autowired
	 RegisterRepository registerRepository;
	 @Autowired
	 PasswordEncoder passwordEncoder;

	  public void create(RegisterprocessDto registerprocessDto , String rawPassword) {
	        String encodedPassword = passwordEncoder.encode(rawPassword);
	        Register register = new Register();
	        register.setName(registerprocessDto.getName());
	        register.setPassword(encodedPassword);
	        registerRepository.save(register);
	    }


}