package com.example.Controller;

import com.example.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.onetoone.User;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;


    @PostMapping("/addUser")
    public String addUser(@RequestBody User user){
        System.out.println("Received: "+ user);
        userRepository.save(user);
        return "User And AadharCard saved successfully";

    }

    @GetMapping("/test")
    public String test() {
        return "Test endpoint works!";
    }
}
