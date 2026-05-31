package com.cleent0ne.financetracker.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cleent0ne.financetracker.enums.Category;
import com.cleent0ne.financetracker.models.Budget;
import com.cleent0ne.financetracker.models.User;

@Repository
public interface BudgetRepository extends JpaRepository<Budget, UUID> {

    List<Budget> findByUser(User user);

    Optional<Budget> findByUserAndCategory(
            User user,
            Category category);
}
