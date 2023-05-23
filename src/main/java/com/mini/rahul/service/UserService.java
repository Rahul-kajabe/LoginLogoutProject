package com.mini.rahul.service;

import java.util.List;

import com.mini.rahul.dto.UserDto;
import com.mini.rahul.entity.User;


public interface UserService {

    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();

}
