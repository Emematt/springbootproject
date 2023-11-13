package com.accountingworkbook.springbootproject.entities.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;



/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("UserID")
    private Integer userId;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Organisation Role")
    private Role role;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }


    public void setId(Integer userId) {
        this.userId = userId;
    }

    public Integer getId() {
        return userId;
    }

    public User getUser(String name) {
        this.name = name;
        return this;
    }
    public void addUser(String name, Role role) {
        this.name = name;
        this.role = role;
    }
}
