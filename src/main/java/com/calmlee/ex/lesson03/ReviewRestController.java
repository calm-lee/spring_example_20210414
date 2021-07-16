package com.calmlee.ex.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.calmlee.ex.lesson03.bo.ReviewsBO;
import com.calmlee.ex.lesson03.model.Review;

@RestController // @Controller + @ResponseBody
public class ReviewRestController {
	
	// 요청 URL : http://localhost/lesson03/ex01
	
	@Autowired
	private ReviewsBO reviewBO;
	
	@RequestMapping("/lesson03/ex01")
	public Review ex01(
//		@RequestParam(value="id") int id // 필수파라미터
//		@RequestParam(value="id", required=true) int id // 필수
//		) 
//		@RequestParam(value="id", required=false) Integer id // 비필수, 값이 NULL일 수도 있기 때문에 Integer로 세팅
		
		@RequestParam(value="id", defaultValue="1") int id // 필수 파라미터, 디폴트값 1
		){
		System.out.println("### id : " + id);
		return reviewBO.getReview(id);
	}
}
