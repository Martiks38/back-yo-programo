package com.portfolio.portfolio.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.portfolio.Models.ProjectModel;
import com.portfolio.portfolio.Services.Project.IProjectService;

@RestController
@RequestMapping("/api/v1")
public class ProjectController {
  
  @Autowired
  private IProjectService projectService;

  @GetMapping("/projects")
  public ResponseEntity<List<ProjectModel>> findProjects(){
    List<ProjectModel> listProjects = projectService.findProjects();

    return new ResponseEntity<>( listProjects, HttpStatus.valueOf(200));
  }

  @PostMapping("/delete/project")
  public ResponseEntity<Boolean> deleteProject(@RequestBody Long id){
    Boolean response = projectService.deleteProject(id);

    return new ResponseEntity<>(response, HttpStatusCode.valueOf(200));
  }

  @PostMapping("/save/project")
  public ResponseEntity<Boolean> saveProject(@RequestBody ProjectModel project){
    Boolean response = projectService.saveProject(project);

    return new ResponseEntity<>(response, HttpStatusCode.valueOf(200));
  }

}
