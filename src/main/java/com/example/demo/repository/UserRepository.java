package com.example.demo.repository;

import com.example.demo.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository {
    User findByUsername(String username);
}
