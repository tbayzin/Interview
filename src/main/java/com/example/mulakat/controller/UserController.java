package com.example.mulakat.controller;

import com.example.mulakat.dto.ProjectSumsDTO;
import com.example.mulakat.model.User;
import com.example.mulakat.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
public class UserController {
    private final UserService userService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping()
    public User saveEmployee(@RequestBody User user) {
        return userService.save(user);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public User updateUser(@PathVariable Integer id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }



    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable Integer id) {
        userService.deleteUserById(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Integer id) {
        return userService.getUserById(id);
    }


    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{}")
    public User highestSalary() {
        return userService.highestSalary;
    }

    /*
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/{name}")
    public List<User> findByName(@PathVariable String name) {
        return userService.findByName(name);
    }
     */


}



