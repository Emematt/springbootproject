package com.accountingworkbook.springbootproject.controllers;


import com.accountingworkbook.springbootproject.entities.user.User;
import com.accountingworkbook.springbootproject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/userController")
public class UserController {

    @Autowired
    private UserRepository userRepo;


    protected User user;

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers(){
        try {
            List<User> userList = new ArrayList<>();
            userRepo.findAll().forEach(userList::add);

            if (userList.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(HttpStatus.OK);
            } catch (Exception ex){
            return  new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);}
    }


    @GetMapping("/getUserById/{id} ")
        public ResponseEntity<User> getUserById(@PathVariable Integer userId)
    {
        Optional<User> userObj = userRepo.findById(userId);
        if (userObj.isPresent()){
            return  new ResponseEntity<>(userObj.get(),HttpStatus.OK);
        } else {
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    @PostMapping("/addUser")
    public ResponseEntity<User> addUser(@RequestBody User user)
    {
        try{
            User userObj = userRepo.save(user);
            return new ResponseEntity<>(userObj,HttpStatus.CREATED);
        } catch (Exception e){
            return  new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/updateUser/{userId}")
    public ResponseEntity<User> updateUser(@PathVariable Integer userId, @RequestBody User user)  {
        try{
            Optional<User> userData = userRepo.findById(userId);
            if (userData.isPresent()){
                User updateUserData = userData.get();
                updateUserData.setRole(user.getRole());
                updateUserData.setName(user.getName());

                User userObj = userRepo.save(updateUserData);
                return new ResponseEntity<>(userObj,HttpStatus.CREATED);
            }

            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        } catch (Exception e){
            return  new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/deleteUserById/{id}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable Integer userId){
        try{
            userRepo.deleteById(userId);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e){
            return  new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/deleteAllUsers")
    public ResponseEntity<HttpStatus> deleteAllUsers(){
        try {
            userRepo.deleteAll();
            return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e){
            return  new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}


