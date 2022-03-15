package com.example.quiz.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class HealthceckDto {

    private boolean status;
    private String message;

}
