package com.gaara.ybbweb.controller;

import com.gaara.ybbweb.entity.UserEntity;
//import com.gaara.ybbweb.service.UserService;
import com.gaara.ybbweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value="")
public class IndexController {

  @Autowired
  UserService userService;

  @RequestMapping(value="", method = RequestMethod.GET)
  public String index() {
    return "login";
  }

  @RequestMapping(value = "/login", method = RequestMethod.POST)
  public String login(@RequestParam(value="userName", required = true) String userName,
                      @RequestParam(value="userPassword", required = true) String userPassword,
                      HttpServletRequest request) {
//
    UserEntity userEntity = userService.getUserByName(userName);

    if (userEntity != null) {
      if (userPassword.equals(userEntity.getPassword())) {
        request.getSession().setAttribute("login_user", userEntity.getId());
        return "login/success";
      }
    }
    return "login/fail";
  }
}
