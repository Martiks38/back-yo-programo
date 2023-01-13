package com.portfolio.portfolio.Services.Project;

import java.util.List;

import com.portfolio.portfolio.Models.ProjectModel;

public interface IProjectService {
  public List<ProjectModel> findProjects();

  public boolean deleteProject(Long id);

  public boolean saveProject(ProjectModel project);
}
