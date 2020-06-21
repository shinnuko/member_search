package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	public void configure(WebSecurity web) throws Exception {
	    web.ignoring().antMatchers("/","/css/**", "/datepicker/**", "/img/**");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
	    http.authorizeRequests() // 認証が必要となるURLを設定します
	        .antMatchers("/login/").permitAll() // /loginFormは認証不要
	        .antMatchers("/register/").permitAll()
	        .antMatchers("/thread/").permitAll() // /thread以下のURLも認証不要
	        .anyRequest().authenticated(); // それ以外はすべて認証された状態じゃなきゃダメ



	}

	@Bean
	public PasswordEncoder passwordEncoder() {
	    return new BCryptPasswordEncoder(); //パスワードのハッシュ化でBCryptを使う
	}


}