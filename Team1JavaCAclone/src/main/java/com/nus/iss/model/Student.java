package com.nus.iss.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@Column(name="std_id_pk")
	private int id;
	
	@OneToOne
	@JoinColumn(name = "user_id_fk")
	private CapsUser userInfo;
	public CapsUser getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(CapsUser userInfo) {
		this.userInfo = userInfo;
	}
	
	private String name;
	private String nick;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, String nick) {
		super();
		this.id = id;
		this.name = name;
		this.nick = nick;
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
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}	
	
}
