package com.portfolio.portfolio.Repositories;

import com.portfolio.portfolio.Models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel, String>{
  
}
