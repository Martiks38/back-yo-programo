package com.portfolio.portfolio.Services.Knowledge;

import com.portfolio.portfolio.Models.KnowledgeModel;
import com.portfolio.portfolio.Repositories.KnowledgeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KnowledgeService implements IKnowledgeService{

  @Autowired
  public KnowledgeRepository knowledgeRepo; 

  @Override
  public List<KnowledgeModel> findKnowledges() {
    List<KnowledgeModel> list = knowledgeRepo.findAll();
    
    return list;
  }

  @Override
  public boolean deleteKnowledge(Long id) {
    try {
      knowledgeRepo.deleteById(id);
      
      return true;
    } catch (Exception e) {
      return false;
    }
  }

  @Override
  public boolean saveKnowledge(KnowledgeModel knowledge) {
    try {
      knowledgeRepo.save(knowledge);
      
      return true;      
    } catch (Exception e) {
      return false;
    }
  }
  
}
