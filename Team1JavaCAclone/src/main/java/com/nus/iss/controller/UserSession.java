package com.nus.iss.controller;

import org.springframework.stereotype.Component;

import com.nus.iss.model.CapsUser;

enum roleEnum {
	student, lecturer, admin
}

@Component
public class UserSession {

	private CapsUser user;
	private roleEnum role;

	public CapsUser getUser() {
		return user;
	}

	public void setUser(CapsUser user) {
		this.user = user;

		if (user != null) {
			// set the role info
			if (user.getLec() != null) {
				this.role = roleEnum.lecturer;
			} else if (user.getStd() != null) {
				this.role = roleEnum.student;
			} else {
				this.role = roleEnum.admin;
			}
		} else {
			this.role = null;
		}
	}

	public roleEnum getRole() {
		return role;
	}

}