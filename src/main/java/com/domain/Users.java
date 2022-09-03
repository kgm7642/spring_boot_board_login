package com.domain;

import lombok.Data;

@Data
public class Users {
	private int useridx;
	private String username;
	private String password;
	private String roles;
}