package com.Controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Enteties.User;
import com.Repositories.UserRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/user")
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	
	@GetMapping("/user/{id}")
	public User getAppelById(@PathVariable Long id) {
		return userRepository.findById(id).get();
	}
	
	@PostMapping("/user")
    public User createClient(@RequestBody User u) {
        return userRepository.save(u);
    }

    @PutMapping("/user/{id}")
    public User updateClient(@PathVariable Long id, @RequestBody User u) {
    	User user = userRepository.findById(id).get();
        user = u;
        return userRepository.save(user);
    }

    @DeleteMapping("/user/{id}")
    public void deleteClientById(@PathVariable Long id) {
    	userRepository.deleteById(id);
    }
}
