package com.sofiqul54.loginsecure.controller;

import com.sofiqul54.loginsecure.entity.Role;
import com.sofiqul54.loginsecure.entity.User;
import com.sofiqul54.loginsecure.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashSet;
import java.util.Set;

@Controller
public class UserController {
    @Autowired
    private UserRepo repo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping(value = "/user-save")
    public String saveUser() {
        Set<Role> roles1 = new HashSet<>();
        roles1.add(new Role(1L));
        roles1.add(new Role(3L));
        User user1 = new User("Sofiq", "sofiqul54@gmail.com", "sofiqul54", passwordEncoder.encode("1234"), true, roles1);
        repo.save(user1);

        Set<Role> roles2 = new HashSet<>();
        roles2.add(new Role(2L));
        roles2.add(new Role(3L));
        User user2 = new User("Azad", "azad@gmail.com", "azad", passwordEncoder.encode("1234"), true, roles2);
        repo.save(user2);

        Set<Role> roles3 = new HashSet<>();
        roles3.add(new Role(2L));
        roles3.add(new Role(3L));
        User user3 = new User("Mostafiz", "mosta@gmail.com", "mosta", passwordEncoder.encode("1234"), true, roles3);
        repo.save(user3);

        return "success";
    }
}
