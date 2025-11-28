package com.SpringSecurity.learnsecurity.repositiory;

import com.SpringSecurity.learnsecurity.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepositiory extends JpaRepository<Users,Integer> {

    Optional<Users> findByUsername(String userName);
}
