package com.rahul.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rahul.crud.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz,Integer>{
    
}
