package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.RegisterDto;

@Controller

public class RegisterController {
	
	@PostMapping
    public String create(@Valid @ModelAttribute RegisterDto registerDto, BindingResult bindingResult) { // ②
        if(bindingResult.hasErrors()) return "register"; // ③
        registerDtosave(registerDto);
        return "redirect:/register";
    }

 
 
private void registerDtosave(@Valid RegisterDto registerDto) {
	// TODO 自動生成されたメソッド・スタブ
	
}

	
	@ModelAttribute
    public RegisterDto setupForm() {
        return new RegisterDto();
    }
	
	
	@RequestMapping(value="register")
	public String registerDto() {
		return "register";
	}

}
