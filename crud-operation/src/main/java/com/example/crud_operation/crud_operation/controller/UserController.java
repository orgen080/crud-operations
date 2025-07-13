package com.example.crud_operation.crud_operation.controller;

import com.example.crud_operation.crud_operation.model.User;
import com.example.crud_operation.crud_operation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")

public class UserController {
private final UserService userService;

@Autowired
    public UserController(UserService userService){
    this.userService=userService;

}
//GET->MERR TE GJITHE PERDORUESIT
@GetMapping
    public List<User> getAllUsers(){
    return userService.getAllUsers();
}
//post ->shtimi i nje user

    @PostMapping
    public User createUser(@RequestBody  User user){
    return userService.createUser(user);
    }
}

