package com.nus.iss.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "lecturer")
public class Lecturer {

	@Id
	@Column(name="lect_id_pk")
	private int id;
	private String name;
	private String email;
	
	@OneToOne
	@JoinColumn(name = "user_id_fk")
	private CapsUser userInfo;
	public CapsUser getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(CapsUser userInfo) {
		this.userInfo = userInfo;
	}
	
	public Lecturer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Lecturer(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
}
