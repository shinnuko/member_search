package com.example.demo.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

@Data

public class RegisterDto implements Serializable {

	
	@NotEmpty
    @Size(min = 1, max = 20)
	private String name;
    
	@NotEmpty
    @Size(min = 1, max = 70)
	private String password;
	

}
