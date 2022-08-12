package com.hotelmanagement.Receptionist.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="CheckinDetails")
public class Checkin {

	@Id
	private String id;
	private String userName;
	private String date;
	private String time;
	private String roomNo;
	
	public Checkin(String id, String userName, String date, String time, String roomNo) {
		super();
		this.id = id;
		this.userName = userName;
		this.date = date;
		this.time = time;
		this.roomNo = roomNo;
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

	@Override
	public String toString() {
		return "Checkin [id=" + id + ", userName=" + userName + ", date=" + date + ", time=" + time + ", roomNo="
				+ roomNo + "]";
	}
	
	
	
}
