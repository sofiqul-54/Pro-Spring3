package com.sofiqul54.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping(value = "/tt/{msg}")
    public String test(@PathVariable("msg") String msg){
        return msg;
    }
}
