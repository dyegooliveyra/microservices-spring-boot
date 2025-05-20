package com.udemycourse.hroauth.feignclients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.udemycourse.hroauth.entities.User;

@Component
@FeignClient(name = "hr-user", path = "/users")
public interface UserFeignClient {

	@GetMapping
	public ResponseEntity<List<User>> findAll();

	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id);

	@GetMapping(value = "/search")
	public ResponseEntity<User> findByEmail(@RequestParam String email);

}
