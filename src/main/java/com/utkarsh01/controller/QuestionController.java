package com.utkarsh01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.utkarsh01.entity.Question;
import com.utkarsh01.service.QuestionService;

@Controller
@RequestMapping("/question")
public class QuestionController {
	
	@Autowired
	private QuestionService service;
	
	@GetMapping("/say")
	public String hello() {
		return "hello brother";
	}
	
	@GetMapping("/allQuestions")
	public List<Question> getAllQuestion() {
		return service.getAllQuestions();
	}
	
	@PostMapping("/category/{category}")
	public List<Question> getQuestionByCategory(@PathVariable("category") String category){
		return service.getAllQuestionByCategories(category);
	}
}
