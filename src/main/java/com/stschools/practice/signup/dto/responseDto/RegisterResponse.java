package com.stschools.practice.signup.dto.responseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class RegisterResponse {

    private Integer id;

    private String name;

    private String message;

}