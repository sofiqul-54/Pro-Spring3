package com.sofiqul54.controller;

import com.sofiqul54.entity.DateImage;
import com.sofiqul54.entity.ImageOptimizer;
import com.sofiqul54.repository.DiRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

@Controller
public class DiController {
    private String UPLOADED_FOLDER = "src/main/resources/static/images/";
    @Autowired
    private ImageOptimizer imageOptimizer;

    @Autowired
    private DiRepo repo;

    @GetMapping(value = "/di")
    public String showDi(DateImage dateImage) {
        return "di-page";
    }

    @PostMapping(value = "/di")
    public String saveDi(@Valid DateImage dateImage, BindingResult bindingResult, Model model, @RequestParam("file") MultipartFile file) {
        if (bindingResult.hasErrors()) {
            return "di-page";
        }
        dateImage.setRegiDate(new Date());
        try {
            //////////////////////For Image Upload start /////////////////////
            byte[] bytes = file.getBytes();
            Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());

            Files.write(path, bytes);
            dateImage.setFileName("new-" + file.getOriginalFilename());
            dateImage.setFileSize(file.getSize());
            // user.setFile(file.getBytes());
            dateImage.setFilePath("images/" + "new-" + file.getOriginalFilename());
            dateImage.setFileExtension(file.getContentType());
            //////////////////////For Image Upload end/////////////////////
            this.repo.save(dateImage);
            model.addAttribute("dateImage", new DateImage());
            model.addAttribute("successMsg", "Congratulations! You are old enough to sign up for this site.");
            imageOptimizer.optimizeImage(UPLOADED_FOLDER, file, 0.3f, 100, 100);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/di-list";
    }

    @GetMapping(value = "/di-list")
    public String index(Model model) {
        model.addAttribute("list", this.repo.findAll());
        return "di-index";
    }

    @GetMapping(value = "/del-di/{id}")
    public String delete(@PathVariable("id") Long id) {
        if (id != null) {
            this.repo.deleteById(id);
        }
        return "redirect:/di-list";
    }

    @GetMapping(value = "/edit-di/{id}")
    public String editDiv(@Valid Model model, @PathVariable("id") Long id){
        model.addAttribute("dateImage", this.repo.getOne(id));
        return "die-page";
    }

    @PostMapping(value = "/edit-di/{id}")
    public String editdi(@Valid DateImage dateImage, BindingResult bindingResult,
                         @PathVariable("id") Long id){
        if (bindingResult.hasErrors()){
            return "die-page";
        }else {
            this.repo.save(dateImage);
        }
        return "redirect:/di-list";
    }


}
