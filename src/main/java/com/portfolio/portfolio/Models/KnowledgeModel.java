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
@Table(name="knowledges")
public class KnowledgeModel {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long knowledge_id;

  private String name_knowledge;
  private String url_img;

  public KnowledgeModel() {
  }

  public KnowledgeModel(Long knowledge_id, String name_knowledge, String url_img) {
    this.knowledge_id = knowledge_id;
    this.name_knowledge = name_knowledge;
    this.url_img = url_img;
  }

}
