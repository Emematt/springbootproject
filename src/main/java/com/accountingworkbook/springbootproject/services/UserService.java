package com.accountingworkbook.springbootproject.services;


import com.accountingworkbook.springbootproject.models.User;
import com.accountingworkbook.springbootproject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

//    public User getUser(Integer id){
//        return userRepository.findById(id);
//    }

    public User createUsers(User user){
        return userRepository.save(user);
    }
}
