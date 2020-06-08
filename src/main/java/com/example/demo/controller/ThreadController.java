package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThreadController {
	
    @RequestMapping("/thread")
    public String thread() {
    	
	    	return "thread";
	}

}