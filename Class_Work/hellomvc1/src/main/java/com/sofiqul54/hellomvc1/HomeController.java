package com.sofiqul54.hellomvc1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping(value = "/")
    public String home(){
        return "Hello MVC";

    }

    @GetMapping(value = "/test")
    public String test(){
        return "Hello TEST";

    }
}
