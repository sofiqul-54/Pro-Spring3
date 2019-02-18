package com.sofiqul54.controller;

import com.sofiqul54.entity.Role;
import com.sofiqul54.entity.User;
import com.sofiqul54.repository.RoleRepo;
import com.sofiqul54.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashSet;
import java.util.Set;

@Controller
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @GetMapping(value = "/user-save")
    public String saveUser() {
        Set<Role> roles1 = new HashSet<>();
        roles1.add(new Role(1L));
        roles1.add(new Role(2L));
        User user1 = new User("Sofiq", "sofiqul54@gmail.com", "sofiq", passwordEncoder.encode("1234"), true,  roles1);
        userRepo.save(user1);


        Set<Role> roles2 = new HashSet<>();
        roles2.add(new Role(1L));
        roles2.add(new Role(3L));
        User user2 = new User("Azad", "azad@gmail.com", "azad", passwordEncoder.encode("1234"), true,  roles2);
        userRepo.save(user2);

        Set<Role> roles3 = new HashSet<>();
        roles3.add(new Role(3L));
        User user3 = new User("Mostafiz", "mosta@gmail.com", "mosta", passwordEncoder.encode("1234"), true,  roles3);
        userRepo.save(user3);
        return "success";
    }
}
