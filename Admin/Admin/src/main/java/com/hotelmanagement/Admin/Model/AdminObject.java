package com.hotelmanagement.Admin.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="AdminDetails")
public class AdminObject {

	@Id
	private String id;
	private String userName;
	private String availRooms;
	private String Checkin;
	private String manage;
	private String update;
	private String logout;
	
	public AdminObject(String id, String userName, String availRooms, String checkin, String manage, String update,
			String logout) {
		super();
		this.id = id;
		this.userName = userName;
		this.availRooms = availRooms;
		Checkin = checkin;
		this.manage = manage;
		this.update = update;
		this.logout = logout;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAvailRooms() {
		return availRooms;
	}

	public void setAvailRooms(String availRooms) {
		this.availRooms = availRooms;
	}

	public String getCheckin() {
		return Checkin;
	}

	public void setCheckin(String checkin) {
		Checkin = checkin;
	}

	public String getManage() {
		return manage;
	}

	public void setManage(String manage) {
		this.manage = manage;
	}

	public String getUpdate() {
		return update;
	}

	public void setUpdate(String update) {
		this.update = update;
	}

	public String getLogout() {
		return logout;
	}

	public void setLogout(String logout) {
		this.logout = logout;
	}

	@Override
	public String toString() {
		return "AdminObject [id=" + id + ", userName=" + userName + ", availRooms=" + availRooms + ", Checkin="
				+ Checkin + ", manage=" + manage + ", update=" + update + ", logout=" + logout + "]";
	}
	
	
	
	
	
}
