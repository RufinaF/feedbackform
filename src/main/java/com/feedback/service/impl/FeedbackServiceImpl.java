package com.feedback.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feedback.dao.FeedbackDAO;

import com.feedback.model.Feedback;
import com.feedback.service.FeedbackService;

@Service
public class FeedbackServiceImpl implements FeedbackService {
	@Autowired
	private FeedbackDAO dao;

	@Override
	public Feedback createFeedback(Feedback feedback) {
				
		return dao.save(feedback);
	}

	@Override
	public Feedback getFeedbackById(int id) {
		
		return dao.findById(id).get();
	}

	@Override
	public Feedback updateFeedback(Feedback feedback) {
		
		return dao.save(feedback);
	}

	@Override
	public void deleteFeedbackById(int id) {
		dao.deleteById(id);
		
	}

	@Override
	public List<Feedback> getAllFeedback() {
		
		return dao.findAll();
	}
	
	@Override
	public List<Feedback> getFeedbackByUsername(String username){
		
		return dao.findByUsername(username);
	}

}
