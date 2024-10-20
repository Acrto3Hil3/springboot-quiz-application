package com.utkarsh01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.utkarsh01.entity.Question;
import com.utkarsh01.repository.QuestionRepository;

@Service
public class QuestionService {
	@Autowired
	private QuestionRepository repository;
	
	public List<Question> getAllQuestions(){
		return repository.findAll();
	}
	
	public List<Question> getAllQuestionByCategories(String category){
		return repository.findbyCategory(category);
	}

}
