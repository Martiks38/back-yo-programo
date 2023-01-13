package com.portfolio.portfolio.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@Table(name="perfil")
public class UserModel {
  @Id
  private String username;
  
  private String password;
  private String description;
  private String contact;

  public UserModel() {}

  public UserModel(String username, String password, String description, String contact) {
    this.username = username;
    this.password = password;
    this.description = description;
    this.contact = contact;
  }
}
