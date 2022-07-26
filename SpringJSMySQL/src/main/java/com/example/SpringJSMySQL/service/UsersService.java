package com.example.SpringJSMySQL.service;

import com.example.SpringJSMySQL.dto.UsersDto;
import com.example.SpringJSMySQL.exception.ValidationException;

import java.util.List;

public interface UsersService {

    UsersDto saveUser(UsersDto usersDto) throws ValidationException;

    void deleteUser(Integer userId);

    UsersDto findByLogin(String login);

    List<UsersDto> findAll();
}
