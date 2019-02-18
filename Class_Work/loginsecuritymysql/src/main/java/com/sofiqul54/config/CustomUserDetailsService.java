package com.sofiqul54.config;

import com.sofiqul54.entity.User;
import com.sofiqul54.repository.UserRepo;
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
    public UserDetails loadUserByUsername(String userNameOrEmail) throws UsernameNotFoundException {

        Optional<User> optionalUser=userRepo.findByUsernameOrEmail(userNameOrEmail, userNameOrEmail);
        optionalUser
                .orElseThrow(()-> new UsernameNotFoundException("Username not found"));
        return optionalUser
                .map(CustomUserDetails::new).get();
    }
}

