package com.flaviots.testemongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flaviots.testemongo.domain.Post;
import com.flaviots.testemongo.repository.PostRepository;
import com.flaviots.testemongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);		
		return obj.orElseThrow(()-> new ObjectNotFoundException("Obejeto Não Encontrado!"));
	}
	
}
