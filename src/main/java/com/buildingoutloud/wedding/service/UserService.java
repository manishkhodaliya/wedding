package com.buildingoutloud.wedding.service;

import org.springframework.util.MultiValueMap;

import com.buildingoutloud.wedding.entity.User;
import com.buildingoutloud.wedding.pojo.UserResponse;

public interface UserService extends BaseService<User, Integer> {

	User registration(User user);

	UserResponse generateUserResponse(User createdUser);


}
