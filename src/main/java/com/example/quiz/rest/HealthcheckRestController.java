package com.example.quiz.rest;

import com.example.quiz.dto.HealthceckDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/health")
public class HealthcheckRestController {

    @GetMapping
    public HealthceckDto healthcheck(){
        HealthceckDto dto = new HealthceckDto(true, "It's working");
        return dto;
    }

}
