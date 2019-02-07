package com.sofiqul54;

import com.sofiqul54.Entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HomeController {
    @GetMapping(value = "/")
    public String home(){
    return "Hello MVC";

    }

    @GetMapping(value = "/test")
    public String test(){
        return "Hello TEST";

    }

    @GetMapping("/user")
    public List<User> getList(){
        List<User> list = new ArrayList<>();
        list.add(new User(1L, "mortoza", "01670909299"));
        list.add(new User(1L, "azad", "01670989299"));
        list.add(new User(1L, "mosta", "01670909799"));
        return list;
    }


}
