package com.accountingworkbook.springbootproject.services;


import com.accountingworkbook.springbootproject.entities.user.User;
import com.accountingworkbook.springbootproject.repositories.UserRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Component
public class UserService {

    private static final String FILE_PATH = "users.json";

    @Autowired
    UserRepository userRepository;

    @Autowired
    ObjectMapper objectMapper;

    public User createUser(User user){

      user = this.userRepository.save(user);
//      Have logic that says, If no file > Create file > Write to file. If file > Update file.
//        Different logic to delete, need one common method (Read All).

      try {objectMapper.writeValue(new File(FILE_PATH), user);} catch (IOException e) {e.printStackTrace();}
      return  user;
    }

    public User updateUser(User user){

        return  this.userRepository.save(user);

    }

    public void deleteAllUsers(){
        this.userRepository.deleteAll();;
    }

    public void deleteUser(Integer userId){
        this.userRepository.deleteById(userId);
    }

    public User getUserById(Integer userId){
        Optional<User> user = this.userRepository.findById(userId);
        if(user.isPresent()){
            return user.get();
        } else{
            throw new RuntimeException("No users found for given Id");
        }
    }
    public List<User> getAllUsers(){
        List<User> users = this.userRepository.findAll();
       return users;
    }











}
