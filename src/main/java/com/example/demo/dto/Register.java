package com.example.demo.dto;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Data;

@Entity
@Table(name = "users")
@Data

public class Register implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer user_id;

    @Column(nullable=false, unique = true)
    private String name;

    @Column(nullable=false, length=60)
    private String password;

    /* (非 Javadoc)
    * @see org.springframework.security.core.userdetails.UserDetails#getAuthorities()
    */
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return  null;
    }

    /* (非 Javadoc)
    * @see org.springframework.security.core.userdetails.UserDetails#getUsername()
    */
    @Override
    public String getUsername() {
        return this.name;
    }

    /* (非 Javadoc)
    * @see org.springframework.security.core.userdetails.UserDetails#isAccountNonExpired()
    */
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    /* (非 Javadoc)
    * @see org.springframework.security.core.userdetails.UserDetails#isAccountNonLocked()
    */
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}