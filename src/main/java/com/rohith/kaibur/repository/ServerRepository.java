package com.rohith.kaibur.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rohith.kaibur.model.Server;



public interface ServerRepository extends MongoRepository<Server, Integer> {


}
