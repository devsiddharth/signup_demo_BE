package com.stschools.practice.signup.dto.requestDto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor

public class RegisterRequest {

    private String name;

    private String email;

    private String phone;

    private String password;

}