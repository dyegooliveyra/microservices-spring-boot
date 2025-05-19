package com.udemycourse.hruser.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.udemycourse.hruser.entities.User;
import com.udemycourse.hruser.repositories.UserRepository;

@Controller
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	private UserRepository userRepository;

	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> list = userRepository.findAll();
		return ResponseEntity.ok().body(list);
	};

	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		Optional<User> user = userRepository.findById(id);
		return ResponseEntity.ok().body(user.get());
	};
	
	@GetMapping(value =  "/search") 
	public ResponseEntity<User> findByEmail(@RequestParam String email) {
		Optional<User> user = userRepository.findByEmail(email);
		return ResponseEntity.ok().body(user.get());
	};

}
