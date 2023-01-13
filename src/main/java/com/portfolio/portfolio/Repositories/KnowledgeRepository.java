package com.portfolio.portfolio.Repositories;

import com.portfolio.portfolio.Models.KnowledgeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KnowledgeRepository extends JpaRepository<KnowledgeModel, Long>{
  
}
