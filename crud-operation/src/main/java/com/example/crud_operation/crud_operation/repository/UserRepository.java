package com.example.crud_operation.crud_operation.repository;

import com.example.crud_operation.crud_operation.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//shtresa ose layer qe e shte e pergjegjsme per manipulimin e te dhenave
@Repository
public class UserRepository {
    private final List<User> users = new ArrayList<>();
//    zakonisht perdoret nje repository per te ruajt users#
//    duke qene se nui kemi konfiguruar databazen e simulojne vet kete mekanizem

    private Long nextId = 1L;


    //metode qe kthen te gjtha users

    public List<User>findAll(){
        return  new ArrayList<>(users);
    }

    //gjej user sipas id
    public Optional<User> findById(Long id){
        return users.stream()
        .filter(user->user.getId().equals(id))
                .findFirst();
    }

    public User save (User user){
        user.setId(nextId++); //i vendos perdorueit nje id unike
        users.add(user);
        return user;
    }

    //fshirjen e nje useri
    public void deleteById(Long id){
        users.removeIf(user->user.getId().equals(id));
    }

    public User update (Long id ,User updateUser){
       Optional<User> existingUser= findById(id);
       if(existingUser.isPresent()){
          User existingOptUser = existingUser.get();
          existingOptUser.setName(updateUser.getName());
          existingOptUser.setEmail(updateUser.getEmail());
          return existingOptUser;
       }
       return null;
    }


}
