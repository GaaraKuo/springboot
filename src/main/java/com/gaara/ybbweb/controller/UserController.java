package com.gaara.ybbweb.controller;

import com.gaara.ybbweb.model.User;
import com.gaara.ybbweb.entity.UserEntity;
import com.gaara.ybbweb.service.IUserService;
import com.gaara.ybbweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

  @Autowired
  private UserService userService1;

  @RequestMapping(value = "/list1", method = RequestMethod.GET)
  public List<UserEntity> list1() {
    return userService1.findAll();
  }

  @RequestMapping(value = "/save", method = RequestMethod.GET)
  public void save(User user) {
    Integer result = userService.insertUser(user);
    System.out.print(result);
  }

  @Autowired
  IUserService userService;

  @RequestMapping(value = "/list", method = RequestMethod.GET)
  public List<User> list() {
    return userService.getAllUsers();
  }
}
