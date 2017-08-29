package com.pankaj.action;

import com.opensymphony.xwork2.ActionSupport;
import com.pankaj.controller.UserMgmtController;

public class UserMgmtAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private short userId;
	private String userName;
	private String email;
	private String phone;
	private String password;

	public String userRegistration() {
		if(userName==null);
		new UserMgmtController().userRegistration(userName,email,phone,password);
		return null;
	}

	public String userLogin() {
		return null;
	}

	public String checkLogin() {
		return null;
	}

	public String forgotPassword() {
		return null;
	}

	public short getUserId() {
		return userId;
	}

	public void setUserId(short userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
