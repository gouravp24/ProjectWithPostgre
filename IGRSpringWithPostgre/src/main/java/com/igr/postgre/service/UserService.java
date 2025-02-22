package com.igr.postgre.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.igr.postgre.entity.User;
import com.igr.postgre.repo.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public List<User> getAllUser() {
		List<User> users = new ArrayList<User>();
		userRepository.findAll().forEach(users::add);
		return users;
	}

	public Optional<User> getUser(int id) {
		return userRepository.findById(id);
	}

	public void addUser(User user) {
		userRepository.save(user);

	}

	public void updateUser(int id, User user) {
//		user.setId(id);
		userRepository.save(user);
	}

	public void deleteUser(int id) {
		userRepository.deleteById(id);

	}



}
