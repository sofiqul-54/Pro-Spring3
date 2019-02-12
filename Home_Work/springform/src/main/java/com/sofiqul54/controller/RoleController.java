package com.sofiqul54.controller;

import com.sofiqul54.entity.Role;
import com.sofiqul54.repository.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class RoleController {
    @Autowired
    private RoleRepo roleRepo;

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
                Role role1 = this.roleRepo.findByRoleName(role.getRoleName());
                if (role1 != null) {
                    model.addAttribute("exitsMsg", "Role Name is Already exist");

                } else {
                    this.roleRepo.save(role);
                    model.addAttribute("role", new Role());
                    model.addAttribute("Success", "Update Successfully");
                }
            }

        }
        return "role/add";
    }


    @GetMapping(value = "role-list")
    public String index(Model model) {
        model.addAttribute("list", this.roleRepo.findAll());
        return "role/index";
    }

    @GetMapping(value = "/role-edit/{id}")
    public String editRoleView(Model model, @PathVariable("id") Long id) {
        model.addAttribute("role", this.roleRepo.getOne(id));
        return "role/edit";
    }

    @PostMapping(value = "/role-edit/{id}")
    public String edit(@Valid Role role, BindingResult bindingResult,
                       @PathVariable("id") Long id, Model model) {
        if (bindingResult.hasErrors()) {
            return "edit";
        } else {
            if (role != null) {
                Role role1 = this.roleRepo.findByRoleName(role.getRoleName());
                if (role1 != null) {
                    model.addAttribute("exitsMsg", "Role Name is Already exist");
                    return "role/edit";
                } else {
                    this.roleRepo.save(role);
                    model.addAttribute("role", new Role());
                    model.addAttribute("Success2", "Update Successfully");
                }
            }
        }
        return "redirect:/role-list";
    }

    @RequestMapping(value = "/role-del/{id}",method = RequestMethod.GET)
    public String delRole(@PathVariable("id") Long id ){
        if (id!=null){
            this.roleRepo.deleteById(id);
        }
        return "redirect:/role-list";

    }


}
