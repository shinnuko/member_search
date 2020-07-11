package com.example.demo.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.example.demo.dao.RegisterRepository;

@Component

public class JpaUserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private RegisterRepository registerRepository;

    @Override
    public UserDetails loadUserByUsername(String name)
            throws UsernameNotFoundException {

    	Register register = registerRepository.findByName(name);
        return register;
    }
}
