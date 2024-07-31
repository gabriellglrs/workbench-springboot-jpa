package com.educandoweb.curso.resources;

import com.educandoweb.curso.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

     @GetMapping
     public ResponseEntity<User> findALL() {

          User u = new User(1L, "maria", "maria@gmail.com", "999999999", "12345");
          return ResponseEntity.ok(u);
     }
}
