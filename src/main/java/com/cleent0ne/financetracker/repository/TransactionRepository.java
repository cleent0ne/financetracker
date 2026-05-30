package com.cleent0ne.financetracker.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cleent0ne.financetracker.enums.Category;
import com.cleent0ne.financetracker.enums.TransactionType;
import com.cleent0ne.financetracker.models.Transaction;
import com.cleent0ne.financetracker.models.User;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    List<Transaction> findByUser(User user);

    List<Transaction> findByUserAndType(
            User user,
            TransactionType type
    );

    List<Transaction> findByUserAndCategory(
            User user,
            Category category
    );
}