package com.coderbd.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.coderbd.entity.Student;
import com.coderbd.repository.StudentRepo;



@Controller
public class StudentController {
	
	@Autowired
	private StudentRepo repo;
	
	@GetMapping("/")
	public String view(Model model) {
		model.addAttribute("list", this.repo.findAll());
		return "index";
	
	}
	
	@GetMapping("/add")
	public String addView(Student student) {
		return "add";
	
	}
	
	
	@PostMapping(value="/add")
	public String add(@Valid Student student, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "add";	
		}
		this.repo.save(student);
		model.addAttribute("student", new Student());
		model.addAttribute("successMsg", "insert data successfully");
		
		return "add";
	}
	
	
	@GetMapping(value="/edit/{id}")
	public String editView(@PathVariable("id") Long id, Model model) {
		model.addAttribute("student", this.repo.findById(id));
		return "edit";
	}
	
	@PostMapping(value="/edit/{id}")
	public String edit(@Valid Student student, @PathVariable("id") Long id,  BindingResult result) {
		if (result.hasErrors()) {
			return "edit";
		}
		this.repo.save(student);
	
		return "redirect:/";
	}
	
	
	@GetMapping(value="/del/{id}")
	public String delet(@PathVariable("id") Long id) {
		if (id != null) {
			this.repo.deleteById(id);
			
		}
		return "redirect:/";
	}

	
	
}
