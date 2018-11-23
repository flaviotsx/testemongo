package com.flaviots.testemongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.flaviots.testemongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{
	
}
