package com.SpringSecurity.learnsecurity.service;

import com.SpringSecurity.learnsecurity.entity.Users;
import com.SpringSecurity.learnsecurity.repositiory.UserLogin;
import com.SpringSecurity.learnsecurity.repositiory.UsersRepositiory;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UsersService implements UserDetailsService {
    private  final  UsersRepositiory usersRepositiory;


    public  UsersService(UsersRepositiory usersRepositiory){
        this.usersRepositiory = usersRepositiory;
    }


    @Override
    public UserDetails loadUserByUsername(String username)  {
        Optional<Users> banda = usersRepositiory.findByUsername(username);
        Users e = banda.orElseThrow(() -> new UsernameNotFoundException("User not fount"));

        return new UserLogin(e);
    }
}
