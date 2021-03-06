package com.example.flightBooking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javassist.NotFoundException;

@Service
public class AdminService {
	@Autowired
	AdminRepository adminRepository;
	
	Admin createAdmin(Admin admin) {
		return adminRepository.save(admin);
	}
	
	String login(Admin admin) {
		Admin payload = adminRepository.findByEmail(admin.getEmail());
		if(payload.equals(null)) {
			throw new RuntimeException("User not found");
		}
		if(payload.getPassword().equals(admin.getPassword())) {
			return "Succesfully Logged In";
		}
		else {
			throw new RuntimeException("Password incorrect");
		}
	}
}
