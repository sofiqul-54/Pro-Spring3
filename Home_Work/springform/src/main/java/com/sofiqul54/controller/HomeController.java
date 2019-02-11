package com.sofiqul54.controller;

import com.sofiqul54.entity.Student;
import com.sofiqul54.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.Date;

@Controller
public class HomeController {
    @Autowired
    private StudentRepo repo;

    @GetMapping(value = "/add")
    public String viewForm(Student student) {

        return "add-page";
    }

    @PostMapping(value = "/add")
    public String saveForm(@Valid Student student, BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()){
            return "add-page";
        }else {
            student.setRegiDate(new Date());
            this.repo.save(student);
            model.addAttribute("student", new Student());
            model.addAttribute("successMsg", "Congratulation!! You are eligible sign up for this sie");
        }
        return "add-page";
    }

    @GetMapping(value = "/")
    public String index(Model model){
        model.addAttribute("list", this.repo.findAll());
        this.repo.findAll().forEach((c)->{
            System.out.println(c.toString());
        });
        return "index";
    }


    @GetMapping(value = "/del/{id}")
    public String delete(@PathVariable ("id") Long id){
        if (id!= null){
            this.repo.deleteById(id);
        }
        return "redirect:/";
    }

    @GetMapping(value = "/edit/{id}")
    public String editView(Model model, @PathVariable ("id") Long id){
        model.addAttribute("student", this.repo.getOne(id));
        return "edit-page";
}

@PostMapping(value = "/edit/{id}")
    public String edit(@Valid Student student, BindingResult bindingResult,
                       @PathVariable("id") Long id){
        if (bindingResult.hasErrors()){
            return "edit-page";
        }else {
            this.repo.save(student);
        }
        return "redirect:/";
}

}
