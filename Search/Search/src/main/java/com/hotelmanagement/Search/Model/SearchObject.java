package com.hotelmanagement.Search.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="HotelInformation")
public class SearchObject {

	@Id
	private String id;
	private String hotelName;
	private String address;
	private String availRooms;
	
	public SearchObject(String id, String hotelName, String address, String availRooms) {
		super();
		this.id = id;
		this.hotelName = hotelName;
		this.address = address;
		this.availRooms = availRooms;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAvailRooms() {
		return availRooms;
	}

	public void setAvailRooms(String availRooms) {
		this.availRooms = availRooms;
	}

	@Override
	public String toString() {
		return "SearchObject [id=" + id + ", hotelName=" + hotelName + ", address=" + address + ", availRooms="
				+ availRooms + "]";
	}

	
	
	
	
	
}
