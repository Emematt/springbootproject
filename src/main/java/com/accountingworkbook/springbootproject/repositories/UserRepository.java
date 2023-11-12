package com.accountingworkbook.springbootproject.repositories;

import com.accountingworkbook.springbootproject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

}
