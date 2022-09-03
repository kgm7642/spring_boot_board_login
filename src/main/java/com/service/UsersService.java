package com.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.domain.Users;
import com.repository.UsersMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UsersService {

	private final UsersMapper mapper;
	private final PasswordEncoder passwordEncoder;
	
	@Transactional
	public int login(Users users) {
		return mapper.login(users);
	}
	
	@Transactional
	public Users getUsers(String usersName) {
		return mapper.getUsers(usersName);
	}
	
	@Transactional
	public void join(Users users) {
		String encodedPassword = passwordEncoder.encode(users.getPassword());
		users.setPassword(encodedPassword);
		users.setRoles("USER");
		mapper.join(users);
	}
}
