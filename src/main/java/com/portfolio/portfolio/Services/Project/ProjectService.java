package com.portfolio.portfolio.Services.Project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.portfolio.Models.ProjectModel;
import com.portfolio.portfolio.Repositories.ProjectRepository;

@Service
public class ProjectService implements IProjectService{

  @Autowired
  public ProjectRepository projectRepo;

  @Override
  public List<ProjectModel> findProjects() {
    List<ProjectModel> list = projectRepo.findAll();

    return list;
  }

  @Override
  public boolean deleteProject(Long id) {
    try {
      projectRepo.deleteById(id);

          return true;
    } catch (Exception e) {
      return false;
    }
  }

  @Override
  public boolean saveProject(ProjectModel project) {
    System.out.println(project);
    
    try {
      projectRepo.save(project);

      return true;
    } catch (Exception e) {
      return false;
    }
  }
  
}
