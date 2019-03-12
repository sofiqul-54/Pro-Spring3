package com.sofiqul54.controller;

import com.sofiqul54.entity.AgencyInfo;
import com.sofiqul54.repo.AgencyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.Date;
import java.util.Optional;

@Controller
@RequestMapping(value = "/agninfo/")
public class AgencyController {

    @Autowired
    private AgencyRepo agencyRepo;

    @GetMapping(value = "add")
    public String viewAdd(Model model) {
        model.addAttribute("agency", new AgencyInfo());
        return "agencys/add";
    }

    @PostMapping(value = "add")
    public String add(@Valid AgencyInfo agencyInfo, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "agencys/add";
        }
        if (agencyRepo.existsByEmail(agencyInfo.getAgnName())) {
            model.addAttribute("rejectMsg", "Already Have This Entry");
            return "agencys/add";
        } else {
            agencyInfo.setAgnName(agencyInfo.getAgnName().toUpperCase());
            agencyInfo.setOpeningDate(new Date());
            this.agencyRepo.save(agencyInfo);
            model.addAttribute("agency", new AgencyInfo());
            model.addAttribute("successMsg", "Successfully Saved!");
        }
        return "agencys/add";
    }

    @GetMapping(value = "edit/{id}")
    public String viewEdit(Model model, @PathVariable("id") Long id) {
        model.addAttribute("agency", agencyRepo.getOne(id));
        return "agencys/edit";
    }

    @PostMapping(value = "edit/{id}")
    public String edit(@Valid AgencyInfo agencyInfo, BindingResult bindingResult, Model model, @PathVariable("id") Long id) {
        if (bindingResult.hasErrors()) {
            return "agencys/edit";
        }
        Optional<AgencyInfo> agn = this.agencyRepo.findByAgnName(agencyInfo.getAgnName());
        if (agn.get().getId() != id) {
            model.addAttribute("rejectMsg", "Already Have This Entry");
            return "agencys/edit";
        } else {
            agencyInfo.setId(id);
            agencyInfo.setAgnName(agencyInfo.getAgnName().toUpperCase());
            this.agencyRepo.save(agencyInfo);
        }
        return "redirect:/agninfo/list";
    }

    @GetMapping(value = "del/{id}")
    public String del(@PathVariable("id") Long id) {
        if (id != null) {
            this.agencyRepo.deleteById(id);
        }
        return "redirect:/agninfo/list";
    }

    @GetMapping(value = "list")
    public String list(Model model){
        model.addAttribute("list", this.agencyRepo.findAll());
    return "agencys/list";
    }
}