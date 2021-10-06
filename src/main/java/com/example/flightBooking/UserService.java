package com.example.flightBooking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	
	User createUser(User user) {
		return userRepository.save(user);
	}
	
	String login(User user) {
		User payload = userRepository.findByEmail(user.getEmail());
		if(payload.equals(null)) {
			throw new RuntimeException("User not found");
		}
		if(payload.getPassword().equals(user.getPassword())) {
			return "Succesfully Logged In";
		}
		else {
			throw new RuntimeException("Password incorrect");
		}
	}
}
