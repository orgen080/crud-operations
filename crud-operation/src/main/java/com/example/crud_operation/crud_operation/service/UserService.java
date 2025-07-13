package com.example.crud_operation.crud_operation.service;

import com.example.crud_operation.crud_operation.model.User;
import com.example.crud_operation.crud_operation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;
    //injektim kontruktori
    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository=userRepository;

    }
    public List<User> getAllUsers(){
        return userRepository .findAll();

    }
    public User createUser(User user){
        return userRepository.save(user);
    }

    public User getUserById(Long id){
        return userRepository.findById(id).orElse(null);

    }
    public User updateUser(Long id ,User updatedUser){
        return userRepository.update(id , updatedUser);
    }
    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }



}
