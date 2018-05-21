package com.gaara.ybbweb.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user")
public class UserEntity implements Serializable {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO, generator = "uuid_string")
  @GenericGenerator(name="uuid_string", strategy = "uuid")
  @Column(name = "u_id")
  private String id;

  @Column(name = "u_name")
  private String name;

  @Column(name = "u_password")
  private String password;

  @Column(name = "u_desc")
  private String description;

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
