package com.portfolio.portfolio.Services.User;

import com.portfolio.portfolio.Models.UserModel;

public interface IUserService {
  public UserModel findUser(UserModel user);

  public String getAboutMe();

  public String getContact();

  public boolean saveAboutMe(String description);

  public boolean saveContact(String contact);
}
