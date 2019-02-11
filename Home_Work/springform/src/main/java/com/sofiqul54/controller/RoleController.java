package com.sofiqul54.controller;

import com.sofiqul54.entity.Role;
import com.sofiqul54.entity.Student;
import com.sofiqul54.repository.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class RoleController {
    @Autowired
    private RoleRepo repo;

    @GetMapping(value = "/add-role")
    public String addRoleView(Role role) {
        return "role/add";
    }

    @PostMapping(value = "/add-role")
    public String addRole(@Valid Role role, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "role/add";
        } else {
            if (role != null) {
                Role role1 = this.repo.findByRoleName(role.getRoleName());
                if (role1 != null) {
                    model.addAttribute("exitsMsg", "Role Name is Already exist");

                } else {
                    this.repo.save(role);
                    model.addAttribute("role", new Role());
                    model.addAttribute("Success", "Update Successfully");
                }
            }

        }
        return "role/add";
    }


    @GetMapping(value = "role/list")
    public String index(Model model){
        model.addAttribute("list", this.repo.findAll());
        return "role/index";
    }

    @GetMapping(value = "role/role-edit/{id}")
    public String editView(Model model, @PathVariable("id") Long id){
        model.addAttribute("student", this.repo.getOne(id));
        return "role-edit";
    }

    @PostMapping(value = "role/role-edit/{id}")
    public String edit(@Valid Role role, BindingResult bindingResult,
                       @PathVariable("id") Long id){
        if (bindingResult.hasErrors()){
            return "edit-page";
        }else {
            this.repo.save(role);
        }
        return "redirect:/role/index";
    }

}
