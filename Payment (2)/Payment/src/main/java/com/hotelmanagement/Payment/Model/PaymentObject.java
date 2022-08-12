package com.hotelmanagement.Payment.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="PaymentInformation")
public class PaymentObject {

	@Id
	 private String id;
	private String payment;
	private String details;
	
	public PaymentObject(String id, String payment, String details) {
		super();
		this.id = id;
		this.payment = payment;
		this.details = details;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "PaymentObject [id=" + id + ", payment=" + payment + ", details=" + details + "]";
	}
	
	
	
}
