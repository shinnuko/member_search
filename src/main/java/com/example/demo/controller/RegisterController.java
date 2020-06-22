package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.RegisterDto;

@Controller

public class RegisterController {

	@ModelAttribute
    public RegisterDto setupForm() {
        return new RegisterDto();
    }

	@RequestMapping(value="register")
	public String registerDto() {
		return "registerDto";
	}

}
