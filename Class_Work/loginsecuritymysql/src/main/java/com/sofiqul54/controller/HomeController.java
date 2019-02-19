package com.sofiqul54.controller;

import com.sofiqul54.entity.User;
import com.sofiqul54.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @Autowired
    private UserRepo repo;

    @GetMapping(value = "/adm")
    public String AdminView(){
        return "admin/admin";
    }

    @GetMapping(value = "/sa")
    public String superAdminView(){
        return "sadmin/sad";
    }

    @GetMapping(value = "/se")
    public String secureView(Model model){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        model.addAttribute("username", auth.getName());
        User user = repo.findByUsername(auth.getName());
        model.addAttribute("name", user.getName());

        return "secure/sce";
    }

    @GetMapping(value = "/u")
    public String user(){
        return "user/u";
    }



}
