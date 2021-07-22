package com.calmlee.ex.lesson04.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.calmlee.ex.lesson04.dao.NewStudentDAO;
import com.calmlee.ex.lesson04.model.NewStudent;

@Service
public class NewStudentBO {
		
		@Autowired
		private NewStudentDAO newStudentDAO;
		
		public void insertNewStudent(NewStudent newStudent) {
			newStudentDAO.insertNewStudent(newStudent);
		}
		
		public NewStudent getNewStudentById(int id) {
			return newStudentDAO.selectNewStudentById(id);
		}

	}
