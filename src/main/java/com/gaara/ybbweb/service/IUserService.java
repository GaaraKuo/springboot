package com.gaara.ybbweb.service;

import com.gaara.ybbweb.model.User;

import java.util.List;

public interface IUserService {
  List<User> getAllUsers();
  Integer insertUser(User user);
}
