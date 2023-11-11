package com.accountingworkbook.springbootproject.repositories;

import com.accountingworkbook.springbootproject.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
