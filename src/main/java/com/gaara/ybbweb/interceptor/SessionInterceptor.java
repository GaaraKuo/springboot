package com.gaara.ybbweb.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionInterceptor implements HandlerInterceptor {

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    if ("/".equals(request.getRequestURI()) ||
        "/login".equals(request.getRequestURI())) {
      return true;
    }
    HttpSession session = request.getSession();
    if (session != null) {
      Object userIdObj = request.getSession().getAttribute("login_user");
      if (userIdObj != null) {
        return true;
      }
    }
    response.sendRedirect("/");
    return false;
  }
}
