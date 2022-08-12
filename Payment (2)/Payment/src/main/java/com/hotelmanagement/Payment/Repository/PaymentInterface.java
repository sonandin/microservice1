package com.hotelmanagement.Payment.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hotelmanagement.Payment.Model.PaymentObject;

public interface PaymentInterface extends MongoRepository<PaymentObject, String> {

}
