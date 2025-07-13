package com.example.crud_operation.crud_operation.dto;


//nje klase dto eshte nje objekt i thjeshte qe perdoret
// per te transferuar te dhena midis backend dhe frontendd
//ofron siguri me te larte

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    //kur krijon ose merr nje user
    //perdor user dto per input ose output qe te mos shfaqet id dhe password

private  String name;
private  String email;


}
