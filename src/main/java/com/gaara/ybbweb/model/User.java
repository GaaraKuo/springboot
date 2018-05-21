package com.gaara.ybbweb.model;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.mapper.SqlCondition;

//@SuppressWarnings("serial")
@TableName(value = "user")
public class User{
  @TableId("u_id")
  private String id;

//  @TableField(value = "u_name",condition = SqlCondition.LIKE)
  @TableField("u_name")
  private String name;

  @TableField("u_password")
  private String password;

  @TableField("u_desc")
  private String description;
//
//  public User(String id, String password, String name, String description) {
//    this.id = id;
//    this.name = name;
//    this.password = password;
//    this.description = description;
//  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
