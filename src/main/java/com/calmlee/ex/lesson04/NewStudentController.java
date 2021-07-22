package com.calmlee.ex.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.calmlee.ex.lesson04.bo.NewStudentBO;
import com.calmlee.ex.lesson04.model.NewStudent;

@RequestMapping("/lesson04/ex02")
@Controller
public class NewStudentController {

	@Autowired
	private NewStudentBO newStudentBO;
	
	//요청 URL : http://localhost/lesson04/ex02/1
	@GetMapping("/1")
	public String addStudentView() {
		
		return "lesson04/addStudent";
	}
	
	@PostMapping("/add_student")
	public String addStudent(
			@ModelAttribute	NewStudent newStudent, // name 태그 값과 일치하는 필드에 값이 들어간다. (일일이 @RequestParam 할 필요 X)
			Model model 
			) {
		
		//insert DB
		newStudentBO.insertNewStudent(newStudent);
		
		//select DB
		newStudent = newStudentBO.getNewStudentById(newStudent.getId()); // 사실 내려주는 용도의 객체를 따로 만드는 게 나음
		model.addAttribute("result", newStudent);
		model.addAttribute("subject", "학생정보");
		
		return "lesson04/afterAddStudent";
	}
}
