package com.example.universite.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EtudiantDto extends PersonnerDto{
    private Long id;
    private String filiere;
    private String Niveau;

}
