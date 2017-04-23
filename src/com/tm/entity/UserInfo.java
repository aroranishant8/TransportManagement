package com.tm.entity;

public class UserInfo {
	
	String userid;
	String password;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public long getContactNo() {
		return ContactNo;
	}
	public void setContactNo(long l) {
		ContactNo = l;
	}
	public long getDealerId() {
		return DealerId;
	}
	public void setDealerId(long l) {
		DealerId = l;
	}
	String fname;
	String lname;
	long ContactNo;
	long DealerId;

}
