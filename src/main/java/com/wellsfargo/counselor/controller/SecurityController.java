package com.wellsfargo.counselor.controller;

import com.wellsfargo.counselor.entity.Advisor;
import com.wellsfargo.counselor.entity.Security;
import com.wellsfargo.counselor.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/securities")
public class SecurityController {

    private final SecurityService securityService;
    @Autowired
    public SecurityController(SecurityService securityService) {
        this.securityService = securityService;
    }
    @GetMapping
    public List<Security> getAllSecurities() {
        return securityService.getAllSecurity();
    }
    @GetMapping("/{id}")
    public Optional<Security> getSecurity(@PathVariable Long id) {
        return securityService.getSecurityById(id);
    }
    @PostMapping
    public Security createSecurity(@RequestBody Security security) {
        return securityService.createSecurity(security);
    }

    @DeleteMapping("/{id}")
    public void deleteSecurity(@PathVariable Long id) {
        securityService.deleteSecurityById(id);
    }

}
