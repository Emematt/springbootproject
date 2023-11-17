package com.accountingworkbook.springbootproject.entities.transaction;

import com.accountingworkbook.springbootproject.entities.Account;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Transaction{




    private Long id;


    @Enumerated(EnumType.ORDINAL)
    private Type type;


    @Enumerated(EnumType.ORDINAL)
    private Status status;

    private  String description;

    private Account account;

    private Long journalNo;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setJournalno(Long journalNo) {
        this.journalNo = journalNo;
    }

    public Long getJournalno() {
        return journalNo;
    }
}
