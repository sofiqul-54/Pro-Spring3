package com.sofiqul54.controller;

import com.sofiqul54.entity.User;
import com.sofiqul54.repository.RoleRepo;
import com.sofiqul54.repository.UserRepo;
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
    private UserRepo repo;

    @Autowired
    private RoleRepo roleRepo;

    @GetMapping(value = "/add")
    public String viewForm(User user, Model model) {
        model.addAttribute("roleList", this.roleRepo.findAll());

        return "add-page";
    }

    @PostMapping(value = "/add")
    public String saveForm(@Valid User user, BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()){
            return "add-page";
        }else {
            user.setRegiDate(new Date());
            this.repo.save(user);
            model.addAttribute("user", new User());
            model.addAttribute("successMsg", "Congratulation!! You are eligible sign up for this sie");
        }
        model.addAttribute("roleList1", this.roleRepo.findAll());
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
        model.addAttribute("user", this.repo.getOne(id));
        model.addAttribute("roleList", this.roleRepo.findAll());
        return "edit-page";
}

@PostMapping(value = "/edit/{id}")
    public String edit(@Valid User user, BindingResult bindingResult,
                       @PathVariable("id") Long id, Model model){
        if (bindingResult.hasErrors()){
            return "edit-page";
        }else {
            this.repo.save(user);
        }
    model.addAttribute("roleList", this.roleRepo.findAll());
        return "redirect:/";
}

}
