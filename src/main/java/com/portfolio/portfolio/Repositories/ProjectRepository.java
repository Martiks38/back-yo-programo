package com.portfolio.portfolio.Repositories;

import com.portfolio.portfolio.Models.ProjectModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProjectRepository extends JpaRepository<ProjectModel, Long>{
  
}
