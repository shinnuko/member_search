package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.example.demo.dto.JpaUserDetailsServiceImpl;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	public void configure(WebSecurity web) throws Exception {
		 // セキュリティ設定を無視するリクエスト設定
        // 静的リソースに対するアクセスはセキュリティ設定を無視する
	    web.ignoring().antMatchers("/","/css/**", "/datepicker/**", "/img/**");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
	http.authorizeRequests() // 認証が必要となるURLを設定します
	        .antMatchers("/login/**").permitAll() // /loginは認証不要
	        .antMatchers("/register/").permitAll()
	        .antMatchers("/thread/").permitAll() // /threadURLも認証不要
	        .antMatchers("/complete").permitAll()
	        .anyRequest().authenticated(); // それ以外はすべて認証された状態じゃなきゃダメ

	http.formLogin()
	    .loginProcessingUrl("/login/") // 認証処理を起動させるパス
	    .loginPage("/login/") // ログインフォームのパス
	    .failureUrl("/login/?error") // ログイン処理失敗時の遷移先
	    .defaultSuccessUrl("/") // 認証成功時の遷移先
	    .usernameParameter("name").passwordParameter("password"); // ユーザ名とパスワード

	http.logout()
	    .logoutRequestMatcher(new AntPathRequestMatcher("/logout**")) // ログアウト処理を起動させるパス
	    .logoutSuccessUrl("/"); // ログアウト完了時のパス



		}

	@Configuration
	protected static class AuthenticationConfiguration
	        extends GlobalAuthenticationConfigurerAdapter {
	    @Autowired
	    JpaUserDetailsServiceImpl userDetailsService;

	    @Override
	    public void init(AuthenticationManagerBuilder auth) throws Exception {
	        auth.userDetailsService(userDetailsService)
	            .passwordEncoder(new BCryptPasswordEncoder());

	    }

	@Bean
	public PasswordEncoder passwordEncoder() {
	    return new BCryptPasswordEncoder(); //パスワードのハッシュ化でBCryptを使う
	}
  }

}