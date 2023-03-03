package com.admincutomer;

public class Admin extends User {
	
	private String adminName;
	private int adminId;
	public String getAdminName() {
		return adminName;
	}
	public int getId() {
		return adminId;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public void setId(int id) {
		this.adminId = id;
	}
	
	

}
