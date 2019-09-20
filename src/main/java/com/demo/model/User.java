package com.demo.model;

public class User {

	String id;
	String name;
	String acc_no;
	int acc_bal;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(String acc_no) {
		this.acc_no = acc_no;
	}
	
	public int getAcc_bal() {
		return acc_bal;
	}
	public void setAcc_bal(int acc_bal) {
		this.acc_bal = acc_bal;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", acc_no=" + acc_no + ", acc_bal=" + acc_bal + "]";
	}
	
	
}
