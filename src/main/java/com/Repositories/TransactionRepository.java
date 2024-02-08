package com.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Enteties.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction,Long>{

}
