package com.accountingworkbook.springbootproject.config;

import com.accountingworkbook.springbootproject.entities.user.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    public User userBean(){
        return new User();
    }


}
