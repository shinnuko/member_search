package com.example.demo.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "users")
@Data

public class RegisterprocessDto implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer user_id;

    @Column(nullable=false)

    private String name;

    @Column(nullable=false, length=20)

    private String password;

}
