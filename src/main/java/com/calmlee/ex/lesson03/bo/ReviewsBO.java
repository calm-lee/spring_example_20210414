package com.calmlee.ex.lesson03.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.calmlee.ex.lesson03.dao.ReviewDAO;
import com.calmlee.ex.lesson03.model.Review;

@Service
public class ReviewsBO {
	
	@Autowired
	private ReviewDAO reviewDAO;
	public Review getReview(int id) {
		return reviewDAO.selectReview(id);
	}

	public int insertReview(Review review) {
		return reviewDAO.insertReview(review);
	}
	
	public int insertReviewAsField(String storeName, String menu, String userName, double point, String review) {
		return reviewDAO.insertReviewField(storeName, menu, userName, point, review);
	}
}
