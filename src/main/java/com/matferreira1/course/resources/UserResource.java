package com.matferreira1.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matferreira1.course.entities.User;

@RestController
@RequestMapping(value = "/users")

public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Mat", "mat@gmail.com","61999574131" , "123");
		return ResponseEntity.ok().body(u);
	}

}
