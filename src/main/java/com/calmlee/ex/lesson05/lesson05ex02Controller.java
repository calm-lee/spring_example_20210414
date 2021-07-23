package com.calmlee.ex.lesson05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class lesson05ex02Controller {

	@RequestMapping("/lesson05/ex02")
	public String ex02() {
		return "lesson05/ex02";
	}
	
}
