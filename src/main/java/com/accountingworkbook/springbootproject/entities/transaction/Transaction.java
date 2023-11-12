package com.accountingworkbook.springbootproject.entities.transaction;

import com.accountingworkbook.springbootproject.entities.Account;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Transaction{



    @Column
    private Long id;

    @Column
    @Enumerated(EnumType.ORDINAL)
    private Type type;

    @Column
    @Enumerated(EnumType.ORDINAL)
    private Status status;

    @Column
    private  String description;

    @ManyToOne
    private Account account;
    @Id
    private Long journalno;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setJournalno(Long journalno) {
        this.journalno = journalno;
    }

    public Long getJournalno() {
        return journalno;
    }
}
