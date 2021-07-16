package com.calmlee.ex.lesson03.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.calmlee.ex.lesson03.dao.ReviewDAO;
import com.calmlee.ex.lesson03.model.Review;

@Service
public class ReviewsBO {
	@Autowired
	private ReviewDAO reivewDAO;
	public Review getReview(int id) {
		return reivewDAO.selectReview(id);
	}

}
