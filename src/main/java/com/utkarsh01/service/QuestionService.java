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
	
	public Question getQuestion(Integer id) {
		return repository.findById(id).get();
	}
	
	public List<Question> getAllQuestionByCategories(String category){
		return repository.findByCategory(category);
	}
	
	public String addQues(Question question) {
		repository.save(question);
		return "success";
	}
	
	public String updateQUes(Integer id) {
		Question ques=getQuestion(id);
		repository.save(ques);
		return "modified";
		
	}
	
	public String deleteQues(Integer id) {
		repository.deleteById(id);
		return "deleted..";
	}

}
