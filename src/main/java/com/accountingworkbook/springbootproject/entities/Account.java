package com.accountingworkbook.springbootproject.entities;


import com.accountingworkbook.springbootproject.entities.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Account{

    @Column
    private BigDecimal totalAmount;

    private User user;

    @Id
    @GeneratedValue
    private Long accountNumber;


    public void setId(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Long getaccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }
}
