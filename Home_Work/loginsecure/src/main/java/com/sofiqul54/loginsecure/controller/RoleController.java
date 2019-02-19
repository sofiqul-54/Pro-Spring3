package com.sofiqul54.loginsecure.controller;

import com.sofiqul54.loginsecure.entity.Role;
import com.sofiqul54.loginsecure.repository.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "/role/")
public class RoleController {
    @Autowired
    private RoleRepo repo;

    /*@GetMapping(value = "/role-save")
    public String saveRole(){
        Role role = new Role();
        role.setRoleName("SUPERADMIN");
        repo.save(role);

        Role role1 = new Role();
        role1.setRoleName("ADMIN");
        repo.save(role1);

        Role role2 = new Role();
        role2.setRoleName("USER");
        repo.save(role2);
        return "success";
    }*/

    @GetMapping(value = "view-role")
    public String viewRole(Model model) {
        model.addAttribute("listrole", this.repo.findAll());
        return "role/role-view";
    }

    @GetMapping(value = "save-role")
    public String addRoleView(Role role) {
        return "role/role-add";
    }

    @PostMapping(value = "save-role")
    public String addRole(@Valid Role role, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "role/role-add";
        }
        this.repo.save(role);
        model.addAttribute("role", new Role());
        model.addAttribute("success", "Role Data Successfully Inserted");
        return "role/role-add";
    }

    @GetMapping(value = "edit-role/{id}")
    public String editViewRole(@PathVariable("id") Long id, Model model) {
        model.addAttribute("role", this.repo.getOne(id));
        return "role/role-edit";
    }

    @PostMapping(value = "edit-role/{id}")
    public String editRole(@Valid Role role, @PathVariable("id") Long id, BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()){
            return "role/role-edit";
        }
        this.repo.save(role);
        return "redirected:/role/view-role";
    }


    @RequestMapping(value = "del-role/{id}", method = RequestMethod.GET)
    public String delRole(@PathVariable ("id") Long id){
        if (id!=null){
            this.repo.deleteById(id);
        }
        return "redirected:/role/view-role";
    }

}
