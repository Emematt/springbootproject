package com.accountingworkbook.springbootproject.controllers;


import com.accountingworkbook.springbootproject.entities.User;
import com.accountingworkbook.springbootproject.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user) {
      return  userService.createUsers(user);
    }
//
//    @GetMapping("/user/{id}")
//    public User getUser(){
//        return userService.getUser(id);
//    }

}
