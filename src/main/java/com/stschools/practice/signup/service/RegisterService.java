package com.stschools.practice.signup.service;

import com.stschools.practice.signup.dto.requestDto.RegisterRequest;
import com.stschools.practice.signup.dto.responseDto.RegisterResponse;


public interface RegisterService {

    public RegisterResponse register(RegisterRequest request);

}