package com.hotelmanagement.Booking.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="UserInformation")
public class BookingObject {

	@Id
	 private String userName;
	 private String gender;
	 private String email;
	 private String phnNo;
	 private String roomNo;
	
	
	public BookingObject(String userName, String gender, String email, String phnNo, String roomNo) {
		super();
		this.userName = userName;
		this.gender = gender;
		this.email = email;
		this.phnNo = phnNo;
		this.roomNo = roomNo;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhnNo() {
		return phnNo;
	}


	public void setPhnNo(String phnNo) {
		this.phnNo = phnNo;
	}


	public String getRoomNo() {
		return roomNo;
	}


	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}


	@Override
	public String toString() {
		return "BookingObject [userName=" + userName + ", gender=" + gender + ", email=" + email + ", phnNo=" + phnNo
				+ ", roomNo=" + roomNo + "]";
	}
	
	
	
	
	
	
}