package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class AccountController {
	
	 public AccountForm setupForm() {
	        return new AccountForm();
	    }
	 
	    @RequestMapping(value="account")
	    String accountForm() {
	        return "account/accountForm";
	    }

}
