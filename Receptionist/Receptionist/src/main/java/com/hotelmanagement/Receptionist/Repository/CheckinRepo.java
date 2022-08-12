package com.hotelmanagement.Receptionist.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hotelmanagement.Receptionist.Model.Checkin;

public interface CheckinRepo extends MongoRepository<Checkin, String> {

}
