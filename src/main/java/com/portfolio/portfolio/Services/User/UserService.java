package com.portfolio.portfolio.Services.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.portfolio.Models.UserModel;
import com.portfolio.portfolio.Repositories.UserRepository;
import com.portfolio.portfolio.utils.CheckPass;

@Service
public class UserService implements IUserService {

  @Autowired
  public UserRepository userRepo;

  @Override
  public UserModel findUser(UserModel user) {
    UserModel userDb = userRepo.findById(user.getUsername()).orElse(null);

    if(userDb == null){
      return null;
    }

    String pass = user.getPassword();
    String correctPass = userDb.getPassword();

    boolean badRequest = !CheckPass.compare(pass, correctPass);

    if(badRequest){
      return null;
    }

    return userDb;
  }

  @Override
  public String getAboutMe() {
    UserModel user = userRepo.findAll().get(0);

    return user.getDescription();
  }

  @Override
  public boolean saveAboutMe(String description){
    try {
      UserModel user = userRepo.findAll().get(0);

      user.setDescription(description);

      userRepo.save(user);

      return true;
    } catch (Exception e) {
      return false;
    }
  }

  @Override
  public String getContact() {
    String contact = userRepo.findAll().get(0).getContact();
    
    return contact;
  }

  @Override
  public boolean saveContact(String contact) {
    try {
      UserModel user = userRepo.findAll().get(0);

      user.setContact(contact);

      userRepo.save(user);

      return true;
    } catch (Exception e) {
      return false;
    }
  }
}
