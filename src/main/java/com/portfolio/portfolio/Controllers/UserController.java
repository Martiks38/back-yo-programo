package com.portfolio.portfolio.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.portfolio.Models.UserModel;
import com.portfolio.portfolio.Services.User.IUserService;

@RestController
@RequestMapping("/api/v1")
public class UserController {

  @Autowired
  private IUserService userServ;

  @PostMapping("/auth/login")
  public ResponseEntity<Boolean> findUser(@RequestBody UserModel user){
    UserModel userDB =  userServ.findUser(user);

    if(userDB == null) return new ResponseEntity<>(false, HttpStatus.valueOf(200));

    return new ResponseEntity<>(true, HttpStatus.valueOf(200));
  }

  @GetMapping("/about-me")
  public ResponseEntity<String> getAboutMe(){
    String about = userServ.getAboutMe();

    return new ResponseEntity<>(about, HttpStatus.valueOf(200));
  }

  @PostMapping("/update/about-me")
  public ResponseEntity<Boolean> saveAboutMe(@RequestBody String description){
    Boolean response = userServ.saveAboutMe(description);

    return new ResponseEntity<>(response, HttpStatus.valueOf(200));
  }


  @GetMapping("/contact")
  public ResponseEntity<String> getContact(){
    String response = userServ.getContact();
    
    return new ResponseEntity<>(response, HttpStatus.valueOf(200));
  }

  @PostMapping("/update/contact")
  public ResponseEntity<Boolean> saveContact(@RequestBody String contact){
    Boolean response = userServ.saveContact(contact);

    return new ResponseEntity<>(response, HttpStatus.valueOf(200));
  }

}
