package com.hotelmanagement.Booking.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hotelmanagement.Booking.Model.BookingObject;

public interface BookingInterface extends MongoRepository<BookingObject, String> {

}
