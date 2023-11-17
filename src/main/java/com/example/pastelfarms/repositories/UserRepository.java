package com.example.pastelfarms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.pastelfarms.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findUserById(long id);
    User findUserByUsername(String username);

    User findUserByEmail(String email);
}
