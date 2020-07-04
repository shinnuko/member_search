package com.example.demo.dto;

import java.io.Serializable;

import lombok.Data;

@Data

public class RegisterDto implements Serializable {

	

	private String name;

	private String password;
	

}
