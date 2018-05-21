package com.gaara.ybbweb.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.gaara.ybbweb.model.User;
import com.gaara.ybbweb.mapper.UserMapper;
import com.gaara.ybbweb.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

  @Override
  public List<User> getAllUsers() {
    return baseMapper.getAllUsers();
  }

  @Override
  public Integer insertUser(User user) {
    return baseMapper.insert(user);
  }
}
