package com.repository;

import org.apache.ibatis.annotations.Mapper;

import com.domain.Users;

@Mapper
public interface UsersMapper {

	public int login(Users users);
	public Users getUsers(String usersName);
	public void join(Users users);

}
