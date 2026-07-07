package com.stschools.practice.signup.service;

import com.stschools.practice.signup.dto.RegisterRequest;
import com.stschools.practice.signup.dto.RegisterResponse;
import com.stschools.practice.signup.entity.User;
import com.stschools.practice.signup.repository.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class RegisterService {

    @Autowired
    private RegisterRepository repository;

    // Write the method HERE
    public RegisterResponse register(RegisterRequest request) {

        User user = new User();

        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setPhone(request.getPhone());
        user.setPassword(request.getPassword());

        User savedUser = repository.save(user);

        return new RegisterResponse(
                savedUser.getId(),
                savedUser.getName(),
                "Registration Successful"
        );
    }

}