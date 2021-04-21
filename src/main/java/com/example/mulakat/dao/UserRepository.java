package com.example.mulakat.dao;

import com.example.mulakat.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <User, Integer> {
    User getUserById(Integer id);
}
