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

import com.portfolio.portfolio.Models.KnowledgeModel;
import com.portfolio.portfolio.Services.Knowledge.IKnowledgeService;


@RestController
@RequestMapping("/api/v1")
public class KnowledgeController {

  @Autowired
  private IKnowledgeService knowledgeService;

  @GetMapping("/knowledges")
  public ResponseEntity<List<KnowledgeModel>> findKnowledges(){
    List<KnowledgeModel> listKnowledge = knowledgeService.findKnowledges();
    
    return new ResponseEntity<>(listKnowledge, HttpStatus.valueOf(200));
  }

  @PostMapping("/save/knowledge")
  public ResponseEntity<Boolean> saveKnowledge(@RequestBody KnowledgeModel knowledge){
    Boolean response = knowledgeService.saveKnowledge(knowledge);

    return new ResponseEntity<>(response, HttpStatusCode.valueOf(200));
  }

  @PostMapping("/delete/knowledge")
  public ResponseEntity<Boolean> deleteKnowledge(@RequestBody Long id){
    Boolean response = knowledgeService.deleteKnowledge(id);
    
    return new ResponseEntity<>(response, HttpStatusCode.valueOf(200));
  }
  
}
