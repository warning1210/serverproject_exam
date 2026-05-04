package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import model.User;
import service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/users")
    public String join(@RequestBody User user){
        System.out.println("Controller 들어옴: " + user.getUsername());
        service.join(user);
        return "OK";
    }
    

    @PostMapping("/login")
    public String login(@RequestBody User user){
        User result = service.login(user);
        return result != null ? "SUCCESS" : "FAIL";
    }
}