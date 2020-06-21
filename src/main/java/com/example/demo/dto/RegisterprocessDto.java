package com.example.demo.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "users")
@Data

public class RegisterprocessDto implements Serializable {
	
	@Id
    @GeneratedValue
    private Integer user_id;
 
    @Column(nullable=false)
    private String display_name;
 
    @Column(nullable=false, length=20)
    private String password;
 
    @Column(nullable=false, updatable=false)
    private Date created_at;
 
    @Column(nullable=false)
    private Date updated_at;
	

}
