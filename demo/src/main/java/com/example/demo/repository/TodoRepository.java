package com.example.demo.repository;

import com.example.demo.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo,Integer> {
    List<Todo>findByEmployeeEmpID(int empID);
}

