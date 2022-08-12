package com.hotelmanagement.Search.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hotelmanagement.Search.Model.SearchObject;

public interface SearchInterface extends MongoRepository<SearchObject, String> {

	

	

}
