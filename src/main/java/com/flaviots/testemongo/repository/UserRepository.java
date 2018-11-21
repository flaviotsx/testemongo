package com.flaviots.testemongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.flaviots.testemongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
	
}
