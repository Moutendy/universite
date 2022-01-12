package com.example.universite.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.MappedSuperclass;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class Personne {

    private String nom;
    private String email;
    private String password;
    private Date datenaissance;
    private String nationalite;

}
