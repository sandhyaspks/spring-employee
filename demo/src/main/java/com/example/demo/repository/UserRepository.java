package com.example.demo.repository;

import com.example.demo.models.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDetails, String> {
}
