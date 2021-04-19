package com.example.mulakat.service;

import com.example.mulakat.dao.UserRepository;
import com.example.mulakat.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository repository;

    public User save(User user) {
        return repository.save(user);
    }

    public User getUserById(Integer id) {
        return repository.getUserById(id);
    }

    public List<User> getAllUsers() {
        return repository.findAll();
    }

    public User updateUser(Integer id, User user) {
        User savedUser = repository.getUserById(id);

        if (savedUser == null) throw new RuntimeException("User not found");

        user.setId(id);

        return repository.save(user);
    }

    public void deleteUser(User user) {
        repository.delete(user);
    }

    public void deleteUserById(Integer id) {
        repository.deleteById(id);
    }
}