package com.example.demo.frontinterface;

import java.io.Serializable;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;


public interface UserDetails extends Serializable {
    Collection<? extends GrantedAuthority> getAuthorities();
 
   
}