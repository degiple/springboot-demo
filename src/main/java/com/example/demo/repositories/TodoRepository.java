package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.models.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}