package com.example.demo.dto;

import java.io.Serializable;

import lombok.Data;

@Data

public class RegisterDto implements Serializable {

	private static final long serialVersionUID = 1L;


	private String display_name;

	private String password;
	private String confirmPassword;//確認用パスワード

	
	 public Object getDisplay_name() {
			// TODO 自動生成されたメソッド・スタブ
			return null;
		}

		public void setDisplay_name(Object display_name) {
			// TODO 自動生成されたメソッド・スタブ

		}




}
