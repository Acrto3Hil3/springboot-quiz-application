package com.utkarsh01.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utkarsh01.entity.Question;


public interface QuestionRepository extends JpaRepository<Question, Integer> {

	List<Question> findByCategory(String category);

}
