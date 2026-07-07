package com.stschools.practice.signup.controller;

import com.stschools.practice.signup.dto.RegisterRequest;
import com.stschools.practice.signup.dto.RegisterResponse;
import com.stschools.practice.signup.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class RegisterController {
    @Autowired
    RegisterService service;

    @PostMapping("/register")
    public RegisterResponse register(@RequestBody RegisterRequest request){

        return service.register(request);

    }
}