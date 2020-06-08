package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShigasouthController {

	@RequestMapping("/shigasouth")
    public String shigasouth() {

		return "shigasouth";

	}

}
