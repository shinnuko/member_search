package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dto.RegisterDto;
import com.example.demo.dto.RegisterprocessDto;
import com.example.demo.service.RegisterService;

@Controller

public class RegisterController {
	
	@Autowired
    RegisterService registerService;


	@ModelAttribute
    public RegisterDto setupForm() {
        return new RegisterDto();
    }


	@RequestMapping(value="register")
	public String registerDto() {
		return "register";
	}
	
	@RequestMapping(value = "/register/", method = RequestMethod.POST)
	 String create(@Validated RegisterDto form, BindingResult bindingResult) {
	     if (bindingResult.hasErrors()) {
	    	 return "/register/";
	     }
	     RegisterprocessDto  registerprocessDto = new RegisterprocessDto ();
	    // RegisterService registerService = new RegisterService ();
	     registerprocessDto.setName(form.getName());
	     registerService.create(registerprocessDto, form.getPassword());
	     return "redirect:/complete";
	 }


	@RequestMapping(value = "/complete", method = RequestMethod.GET)
	 String createFinish() {
	     return "accountComplete";
	 }

}
