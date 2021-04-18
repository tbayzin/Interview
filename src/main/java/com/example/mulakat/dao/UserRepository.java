package com.example.mulakat.dao;

import com.example.mulakat.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Integer> {
    User getUserById(Integer id);
}
