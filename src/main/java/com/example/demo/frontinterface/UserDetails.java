package com.example.demo.frontinterface;

import java.io.Serializable;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

public interface UserDetails extends Serializable {
    Collection<? extends GrantedAuthority> getAuthorities();//getAuthorities ユーザーに与えられている権限リストを返却

    String getPassword();//登録されているパスワードを返却

    String getName();// ユーザー名を返却

    boolean isAccountNonExpired();// アカウントの有効期限の状態を判定

    boolean isAccountNonLocked();//アカウントのロック状態を判定

    boolean isCredentialsNonExpired();//資格情報の有効期限の状態を判定

    boolean isEnabled();//有効なユーザーかを判定
}