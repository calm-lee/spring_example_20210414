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
	
	@RequestMapping("/lesson03/ex02")
	public String ex02() {
		Review review = new Review(); // Spring  bean이 아니고 일반 Java bean
		review.setStoreName("뚜뚜 삼겹");
		review.setMenu("삼겹 꼬막 세트");
		review.setUserName("김또또");
		review.setPoint(5.0);
		review.setReview("맛있어요~~~!!");
		
		int row = reviewBO.insertReview(review); //insert가 된 row 수를 리턴받음
		return "success row count: " + row; // @ResponseBody로 인해 STring 값 자체가 ResponseBody에 담김
	}
	
	
	@RequestMapping("/lesson03/ex03")
	public String ex02_2() {
		int row = reviewBO.insertReviewAsField("도미노피자", "콤비네이션R", "가갸갸", 5.0, "맛있어요!!");
		return "success row count: " + row;
	}
}
