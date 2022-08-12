package com.hotelmanagement.Admin.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hotelmanagement.Admin.Model.AdminObject;

public interface AdminRepo extends MongoRepository<AdminObject, String> {

}
