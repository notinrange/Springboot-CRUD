package com.rahul.crud.model;

import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToMany;

@Entity
@Data
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String title;

    @ManyToMany
    private List<Question> questions;
    
}
