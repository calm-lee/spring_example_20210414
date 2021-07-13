package com.calmlee.ex.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/lesson01/ex01")
@RestController // @Controller + @ResponseBody : 데이터를 내릴 때 주로 사용함
public class Ex01RestController {
	
	// 요청 url : http://localhost/lesson01/ex01
	@RequestMapping("/3")
	public String printString() {
		return "@RestController을 사용해서 String을 리턴해본다.";
	}

	@RequestMapping("/4")
	public Map<String, String> printMap(){
		Map<String, String> map = new HashMap<>();
		map.put("aaa","111");
		map.put("bbb","111");
		map.put("ccc","111");
		
		return map; //JSON으로 변환
	}
	
	@RequestMapping("/5")
	public Data printData() {
		Data data = new Data(); // 일반 자바 bean
		data.setId(1);
		data.setName("김제니");
		
		System.out.println(data);
		return data; // 일반 bean 객체도 JSON으로 내려간다. (jackson 라이브러리 때문에)
	}	
	
	@RequestMapping("/6")
	public ResponseEntity<Data> entity() { // Generic
		Data data = new Data(); // 일반 자바 bean
		
		data.setId(2);
		data.setName("옐리나");

		
//		크롬 > Network 탭 응닶값 확인
//		return new ResponseEntity<>(data, HttpStatus.OK); // 200 ok
		return new ResponseEntity<>(data, HttpStatus.INTERNAL_SERVER_ERROR); // 500 ok
	}
	
}
