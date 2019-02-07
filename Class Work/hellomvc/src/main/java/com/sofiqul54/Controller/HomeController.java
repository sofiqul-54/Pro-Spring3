package com.sofiqul54.Controller;

import com.sofiqul54.Entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HomeController {
    static List<User> list;
    static {
        list = new ArrayList<>();
        list.add(new User(1L, "mortoza", "01670909299"));
        list.add(new User(2L, "azad", "01670909298"));
        list.add(new User(3L, "mosta", "01670909297"));

    }

    @GetMapping(value = "/")
    public String home(){
    return "Hello MVC";

    }

    @GetMapping(value = "/test")
    public String test(){
        return "Hello TEST";

    }

    @GetMapping("/list")
    public List<User> getList(){
        return this.list;
    }

    @GetMapping(value = "/user")
    public User getUser(){
        return new User(1L, "mortoza", "01670909299");
    }

    @GetMapping(value = "/user/{id}/{mobile}")
    public User getUserById(@PathVariable("id") Long userid, @PathVariable("mobile") String m){
        User user= null;
        for(User u : this.list){
            if(userid==u.getId() && m.equalsIgnoreCase(u.getMobile())){
                user = new User();
                user=new User(u.getId(), u.getUsername(), u.getMobile());
                break;
            }
        }
        return user;
    }

    @GetMapping(value = "/addUser")
    public  List<User> addUserToList(){
        list.add(new User(4L, "Mehedee", "01670909296"));
        return list;
    }
long id = list.size();
    @GetMapping(value = "/add/{username}/{mobile}")
    public  List<User> addUserToListDynamically(@PathVariable ("username") String u,
                                                @PathVariable("mobile") String m){
        id++;
        list.add(new User(id, u, m));
        return list;
    }

    @GetMapping(value = "/del/{id}")
    public  List<User> removeUsewrToListDynamacially(@PathVariable ("id") Long id){
        list.remove(id);
return list;
    }

}
