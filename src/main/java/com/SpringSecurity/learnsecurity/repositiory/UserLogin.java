package com.SpringSecurity.learnsecurity.repositiory;

import com.SpringSecurity.learnsecurity.entity.Users;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

public class UserLogin implements UserDetails {

    private final Users u1 ;

    public UserLogin(Users u1) {
        this.u1 = u1;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        return List.of(()->"read");
    }

    @Override
    public String getPassword() {
        return u1.getPassword();
    }

    @Override
    public String getUsername() {
        return u1.getUsername();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
