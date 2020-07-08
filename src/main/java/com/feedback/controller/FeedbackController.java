package com.feedback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.feedback.model.Feedback;
import com.feedback.service.FeedbackService;


@RestController
public class FeedbackController {
	
	@Autowired
	private FeedbackService service;
	
	
	@PostMapping("/feedback")
	public Feedback createFeedback(@RequestBody Feedback feedback) {
		
		return service.createFeedback(feedback);
	}

	@GetMapping("/feedback/{id}")
	public Feedback getFeedbackById(@PathVariable("id") int id) {
		
		
			return service.getFeedbackById(id);
		
	}

	
	@PutMapping("/feedback")
	public Feedback updateFeedback(@RequestBody Feedback feedback) {
		
		return service.updateFeedback(feedback);
	}

	@DeleteMapping("/feedback/{id}")
	public void deleteFeedbackById(@PathVariable("id") int id) {
		
		service.deleteFeedbackById(id);
	}

	@GetMapping("/feedbacks")
	public List<Feedback> getAllFeedback() {
		
		return service.getAllFeedback();
	}

	@GetMapping("/feedback/username/{username}")
	public List<Feedback> getFeedbackByUsername(@PathVariable("username") String username) {
		
		return service.getFeedbackByUsername(username);
	}

}
