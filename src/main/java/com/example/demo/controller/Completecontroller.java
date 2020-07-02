package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class Completecontroller {
	
	@RequestMapping("/complete")
    public String complete() {
    	
	    	return "complete";
	}

}
