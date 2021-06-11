package com.example.mulakat.controller;

import com.example.mulakat.model.User;
import com.example.mulakat.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping()
    public List<User> getAll() {
        return userService.getAllUsers();
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




    @ResponseStatus(HttpStatus.TOO_MANY_REQUESTS)
    @GetMapping("/listProjectSums")
    public List<User> listProjectSums () {


        return  userService.sumAllSalaries();
    }


}



