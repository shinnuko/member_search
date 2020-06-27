package com.example.demo.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Table(name = "users")
@Data

public class RegisterprocessDto implements Serializable {

	@Id
    @GeneratedValue
    private Integer user_id;

    @Column(nullable=false)
    @NotNull // (1)対象のフィールドがnullでないことを示すjavax.validation.constraints.NotNullを付ける。
    @Size(min = 1, max = 20) // (2)対象のフィールドの文字列長が指定したサイズの範囲内にあることを示す
    private String display_name;

    @Column(nullable=false, length=20)
    @NotNull
	@Size(min = 8)//	入力必須	8文字以上 confirmPasswordと同じ値であること
    private String password;

    @Column(nullable=false, updatable=false)
    private Date created_at;

    @Column(nullable=false)
    private Date updated_at;




}
