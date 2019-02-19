package com.sofiqul54.controller;

import com.sofiqul54.entity.Role;
import com.sofiqul54.repository.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.jws.WebParam;
import javax.validation.Valid;

@Controller
@RequestMapping(value = "/role")
public class RoleController {
    @Autowired
    private RoleRepo repo;

    /*@GetMapping(value = "/role-save")
    private String saveRole() {
        Role role1 = new Role();
        role1.setRoleName("SUPERADMIN");
        repo.save(role1);

        Role role2 = new Role();
        role2.setRoleName("ADMIN");
        repo.save(role2);

        Role role3 = new Role();
        role3.setRoleName("USER");
        repo.save(role3);
        return "success";

    }
*/
    @GetMapping(value = "/add-role")
    public String addRoleView(Role role) {
        return "role/add";
    }

    @PostMapping(value = "/add-role")
    public String saveRole(@Valid Role role, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "role/add";
        }
        role.getRoleName().toUpperCase();
        this.repo.save(role);
        model.addAttribute("role", new Role());
        model.addAttribute("success", "Role has been Successfully Inserted");
        return "role/list";
    }

    @GetMapping(value = "/list-role")
    public String viewRoleList(Model model) {
        model.addAttribute("list", this.repo.findAll());
        return "role/list";
    }

    @GetMapping(value = "/edit-role/{id}")
    public String editView(Model model, @PathVariable("id") Long id) {
        model.addAttribute("role", this.repo.getOne(id));
        return "role/edit";

    }

    @PostMapping(value = "/edit-role/{id}")
    public String editRole(@Valid Role role, BindingResult bindingResult, @PathVariable("id") Long id, Model model) {
        if (bindingResult.hasErrors()) {
            return "roll/add";
        }
        this.repo.save(role);
        model.addAttribute("role", new Role());
        model.addAttribute("success", "Role Update Successfully Inserted");
        return "/list-role";
    }

    @RequestMapping(value = "/del-role/{id}", method = RequestMethod.GET)
    public String delRole(@PathVariable("id") Long id) {
        if (id != null) {
            this.repo.deleteById(id);
        }
        return "redirected:/role/list-role";
    }
}
