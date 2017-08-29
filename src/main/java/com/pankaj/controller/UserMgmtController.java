package com.pankaj.controller;

import com.pankaj.dao.UserMgmtDao;
import com.pankaj.dto.UserMaster;

public class UserMgmtController {

	public void userRegistration(String userName, String email, String phone, String password) {
		try {
			UserMaster userMaster = new UserMaster(userName, email, phone, password);
			new UserMgmtDao().registerUser(userMaster);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
