package com.gaara.ybbweb.mapper;

import com.gaara.ybbweb.model.User;

import java.util.List;

public interface UserMapper extends SuperMapper<User>{
  List<User> getAllUsers();
}
