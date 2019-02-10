package com.sofiqul54.controller;

import com.sofiqul54.entity.Student;
import com.sofiqul54.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class HomeController {
    @Autowired
    private StudentRepo studentRepo;

    @GetMapping(value = "/add")
    public String showForm(Student student) {
        return "add-page";
    }

    @PostMapping("/add")
    public String doSave(@Valid Student student, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "add-page";
        }
        this.studentRepo.save(student);
        model.addAttribute("student", new Student());
        return "redirect:/";
    }




}
