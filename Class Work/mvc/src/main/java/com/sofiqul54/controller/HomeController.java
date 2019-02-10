package com.sofiqul54.controller;

import com.sofiqul54.entity.User;
import com.sofiqul54.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class HomeController {
    @Autowired
    private UserRepo repo;

    @GetMapping(value = "/add")
    public String showForm(User user) {

        return "add-page";
    }


    @PostMapping("/add")
    public String save(@Valid User user, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "add-page";
        }
        this.repo.save(user);
        model.addAttribute("user", new User());
        model.addAttribute("successMsg", "Congratulation!! You are eligible sign up for this sie");
        return "add-page";
    }
    @GetMapping("/edit/{id}")
    public String editView(Model model, @PathVariable("id") Long id){
       model.addAttribute("user", this.repo.getOne(id));
        return "edit-page";
    }

    @PostMapping("/edit/{id}")
    public String edit(@Valid User user, BindingResult bindingResult,
                       Model model, @PathVariable("id") Long id){
        if(bindingResult.hasErrors()){
            return "edit-page";
        }
        this.repo.save(user);
        model.addAttribute("user", new User());
        return "redirect:/";
    }

   /*@GetMapping("/results")
    public String showResult(){
        return  "results";
   }*/

    @GetMapping(value = "/")
    public String index(Model model) {
        model.addAttribute("list", this.repo.findAll());
        return "index";
    }

    @GetMapping(value = "/del{id}")
    public String delete(@PathVariable ("id") Long id/*, Model model*/) {
        if(id != null){
            this.repo.deleteById(id);
           /* model.addAttribute("delMsg", "Delete A User Successfully");*/
        }
        return "redirect:/";
    }


}
