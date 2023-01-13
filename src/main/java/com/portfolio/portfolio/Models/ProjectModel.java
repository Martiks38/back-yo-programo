package com.portfolio.portfolio.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@Table(name="projects")
public class ProjectModel {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long project_id;

  private String description;
  private String title;
  private String url_page;
  private String url_code;
  private String url_img;

  public ProjectModel() {
  }

  public ProjectModel(Long project_id, String description, String title, String url_page, String url_code, String url_img) {
    this.project_id = project_id;
    this.description = description;
    this.title = title;
    this.url_page = url_page;
    this.url_code = url_code;
    this.url_img = url_img;
  }

}
