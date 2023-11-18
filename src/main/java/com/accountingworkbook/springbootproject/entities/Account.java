package com.accountingworkbook.springbootproject.entities;


import com.accountingworkbook.springbootproject.entities.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(totalAmount, account.totalAmount) && Objects.equals(user, account.user) && Objects.equals(accountNumber, account.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalAmount, user, accountNumber);
    }
}
