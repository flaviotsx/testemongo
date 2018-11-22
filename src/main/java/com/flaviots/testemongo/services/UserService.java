package com.flaviots.testemongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flaviots.testemongo.domain.User;
import com.flaviots.testemongo.dto.UserDTO;
import com.flaviots.testemongo.repository.UserRepository;
import com.flaviots.testemongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
	
	public User findById(String id) {
		Optional<User> obj = repo.findById(id);		
		return obj.orElseThrow(()-> new ObjectNotFoundException("Obejeto Não Encontrado!"));
	}
	
	public User insert(User obj) {
		return repo.insert(obj);
	}
	
	public 	User fromDTO(UserDTO objDto) {		
		return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
	}
}
