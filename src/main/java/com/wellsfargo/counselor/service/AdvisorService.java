package com.wellsfargo.counselor.service;

import com.wellsfargo.counselor.entity.Advisor;
import com.wellsfargo.counselor.repository.AdvisorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdvisorService {
    private final AdvisorRepository advisorRepository;

    public AdvisorService(AdvisorRepository advisorRepository) {
        this.advisorRepository = advisorRepository;
    }

    public List<Advisor> getAllAdvisors() {
        return advisorRepository.findAll();
    }

    public Advisor createAdvisor(Advisor advisor) {
        return advisorRepository.save(advisor);
    }

}
