package com.calmlee.ex.lesson05;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class lesson05ex02Controller {

	@RequestMapping("/lesson05/ex02")
	public String ex02(Model model) {
		// list
		List<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("melon");
		fruits.add("grape");
		fruits.add("mango");
		
		model.addAttribute("fruits", fruits);
		
		// List<Map>
		List<Map<String,Object>> users = new ArrayList<>();
		Map<String, Object> map1 = new HashMap<>();
		map1.put("name", "김제니");
		map1.put("age", 25);
		map1.put("hobby", "넷플릭스 보기");
		users.add(map1);
		
		map1 = new HashMap<>();
		map1.put("name", "이지은");
		map1.put("age", 29);
		map1.put("hobby", "작사");
		users.add(map1);
		
		model.addAttribute("users", users);
		
		return "lesson05/ex02";
	
	}
	
	@RequestMapping("/lesson05/ex03")
	public String ex03(Model model) {
		Date today = new Date();
		model.addAttribute("today", today);
		return "lesson05/ex03";
	}
	
}
