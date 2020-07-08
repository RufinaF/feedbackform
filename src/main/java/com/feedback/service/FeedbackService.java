package com.feedback.service;

import java.util.List;


import com.feedback.model.Feedback;

public interface FeedbackService {
	
	public Feedback createFeedback(Feedback feedback);
	public Feedback getFeedbackById(int id);
	public Feedback updateFeedback(Feedback feedback);
	public void deleteFeedbackById(int id);
	public List<Feedback> getAllFeedback();
	public List<Feedback> getFeedbackByUsername(String username);

}
