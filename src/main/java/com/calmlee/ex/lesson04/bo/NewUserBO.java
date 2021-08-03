package com.calmlee.ex.lesson04.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.calmlee.ex.lesson04.dao.NewUserDAO;
import com.calmlee.ex.lesson04.model.NewUser;

@Service
public class NewUserBO {
	
	@Autowired
	private NewUserDAO newUserDAO;
	
	public void insertNewUser(String name, String birth, String introduce, String email) {
		newUserDAO.insertNewUser(name, birth, introduce, email);
	}
	
	public NewUser getLastUser() {
		return newUserDAO.selectLastUser();
	}
	
	public boolean existNewUserByName(String name) {
		return newUserDAO.existNewUserByName(name);
	}
	

}
