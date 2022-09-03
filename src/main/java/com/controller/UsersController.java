package com.controller;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.domain.Users;
import com.service.UsersService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/users")
@RequiredArgsConstructor
public class UsersController {

	private final UsersService service;
	
	@GetMapping("/login")
	public String login() {
		System.out.println("로그인 페이지");
		return "/users/login";
	}
	
	@GetMapping("/join")
	public String join() {
		return "/users/join";
	}
	
	@PostMapping("/joinDo")
	public String joinDo(Users users) {
		service.join(users);
		return "redirect:/users/login";
	}
}
