package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dao.RegisterRepository;
import com.example.demo.dto.RegisterDto;
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
	 
	 @Autowired
	 RegisterService registerService;

	 @RequestMapping(value = "/register", method = RequestMethod.POST)
	 String create(@Validated RegisterDto form, BindingResult bindingResult) {
	     if (bindingResult.hasErrors()) {
	         return "registerDto";
	     }
	     RegisterDto  register = new RegisterDto ();
	     register.setDisplay_name(form.getDisplay_name());
	     RegisterService.create(register, form.getPassword());
	     return "redirect:/complete";
	 }

	 private static void create(RegisterDto register, String password) {
		

	}

	@RequestMapping(value = "/complete", method = RequestMethod.GET)
	 String createFinish() {
	     return "accountcomplete";
	 }

}