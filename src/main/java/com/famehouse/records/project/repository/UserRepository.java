package com.famehouse.records.project.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.famehouse.records.project.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
