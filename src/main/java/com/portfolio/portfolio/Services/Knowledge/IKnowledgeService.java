package com.portfolio.portfolio.Services.Knowledge;

import java.util.List;

import com.portfolio.portfolio.Models.KnowledgeModel;

public interface IKnowledgeService {
  public List<KnowledgeModel> findKnowledges();

  public boolean deleteKnowledge(Long id);

  public boolean saveKnowledge(KnowledgeModel knowledge);
}
