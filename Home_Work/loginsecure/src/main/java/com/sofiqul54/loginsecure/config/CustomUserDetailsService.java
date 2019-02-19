package com.sofiqul54.loginsecure.config;

import com.sofiqul54.loginsecure.entity.User;
import com.sofiqul54.loginsecure.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String usernameOrEmail) throws UsernameNotFoundException {
        Optional<User> OptionalUsers = userRepo.findByUsernameOrEmail(usernameOrEmail, usernameOrEmail);
        OptionalUsers.orElseThrow(()-> new UsernameNotFoundException("Username not found"));
        return OptionalUsers.map(CustomUserDetails::new).get();
    }
}
