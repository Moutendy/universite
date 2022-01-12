package com.example.universite.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonnerDto {

    private Long id;
    private String nom;
    private String email;
    private String password;
    private Date datenaissance;
    private String nationalite;
}
