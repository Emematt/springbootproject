//package com.accountingworkbook.springbootproject.repositories;
//
//import com.accountingworkbook.springbootproject.entities.transaction.Transaction;
//import jakarta.persistence.LockModeType;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Lock;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface TransactionRepository extends JpaRepository <Transaction,Long> {
//
//    @Lock(LockModeType.OPTIMISTIC)
//    Transaction save(Transaction transaction);
//
//}
