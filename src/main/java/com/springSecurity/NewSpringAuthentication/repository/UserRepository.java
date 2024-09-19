package com.springSecurity.NewSpringAuthentication.repository;

import com.springSecurity.NewSpringAuthentication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String username);
}
