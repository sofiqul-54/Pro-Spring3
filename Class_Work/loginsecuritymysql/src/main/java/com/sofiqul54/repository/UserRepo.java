package com.sofiqul54.repository;

import com.sofiqul54.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
     Optional<User> findByUsernameOrEmail(String username, String email);
     User findByUsername(String username);
}
