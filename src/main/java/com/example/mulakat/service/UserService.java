package com.example.mulakat.service;

import com.example.mulakat.dto.ProjectSumsDTO;
import com.example.mulakat.model.Project;
import com.example.mulakat.repository.UserRepository;
import com.example.mulakat.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository repository;


    // Bu metod düzeltilecek
    public User highestSalary() {
        return repository.getUserById(id);
    }

 /*   public Project findBySalarySum(Integer id) {
        return repository.getProjectById(id);
    }
    */

    public User save(User user) {
        return repository.save(user);
    }

    public User getUserById(Integer id) {
        return repository.getUserById(id);
    }

    /*
    public List<User> getAllUsers() {
        return repository.findAll();
    }
     */

    public List<User> findByName() {
        return repository.findByName("name");
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