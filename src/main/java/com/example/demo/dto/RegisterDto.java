package com.example.demo.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data

public class RegisterDto implements Serializable {

	private static final long serialVersionUID = 1L;


	 @NotNull // (1)対象のフィールドがnullでないことを示すjavax.validation.constraints.NotNullを付ける。
	 @Size(min = 1, max = 20) // (2)対象のフィールドの文字列長が指定したサイズの範囲内にあることを示す
	 private String name;

	 @NotNull
	 @Size(min = 8)
	 private String password;//	入力必須	8文字以上 confirmPasswordと同じ値であること

	 private String confirmPassword;//確認用パスワード

	public Object getDisplay_name() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public void setDisplay_name(Object display_name) {
		// TODO 自動生成されたメソッド・スタブ

	}


}
