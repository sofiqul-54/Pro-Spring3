package com.sofiqul54.config;

import com.sofiqul54.entity.User;
import com.sofiqul54.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class Test {
    @Autowired
    private UserRepo repo;

   @ResponseBody
    @GetMapping(value = "/test")
    public Optional<User> display(){
       return repo.findByUsernameOrEmail("sofiqul");
   }
}
