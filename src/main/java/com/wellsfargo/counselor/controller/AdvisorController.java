package com.wellsfargo.counselor.controller;


import com.wellsfargo.counselor.entity.Advisor;
import com.wellsfargo.counselor.service.AdvisorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/advisors")
public class AdvisorController {

    private final AdvisorService advisorService;

    @Autowired
    public AdvisorController(AdvisorService advisorService) {
        this.advisorService = advisorService;
    }
    @GetMapping
    public List<Advisor> getAllAdvisors(){
        return advisorService.getAllAdvisors();
    }
    @GetMapping("/{id}")
    public Optional<Advisor> getAdvisor(@PathVariable Long id){
        return advisorService.getAdvisorById(id);
    }
    @PostMapping
    public Advisor createAdvisor(@RequestBody Advisor advisor){
        return advisorService.createAdvisor(advisor);
    }
    @DeleteMapping("/{id}")
    public void deleteAdvisor(@PathVariable Long id){
        advisorService.deleteAdvisor(id);
    }

}
