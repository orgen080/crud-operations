package com.example.crud_operation.crud_operation.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
//Lombok eshe librari qe shmang shkrimin e kodit te perseiur (boilerplate code),duke autormatikisht
//getters dhe setters,konstruktore,metoda ,toString

@Data //gjeneronn geteds seters toString ,equals hashcode
@AllArgsConstructor //gjenmerom konstruktor me te gjitha fushat
@NoArgsConstructor //konstruktor bosh
@Slf4j //shton automatikisht logs,log.info,log.error
public class User {
    private Long id;
    private String name;
    private String email;

}
