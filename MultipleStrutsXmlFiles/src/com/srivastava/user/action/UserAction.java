package com.srivastava.user.action;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{
	private String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public String execute(){
		this.setMessage("Welcome User");
		return SUCCESS;
	}
}
