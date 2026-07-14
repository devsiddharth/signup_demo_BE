package com.stschools.practice.signup.service.impl;

import com.stschools.practice.signup.dto.requestDto.RegisterRequest;
import com.stschools.practice.signup.dto.responseDto.RegisterResponse;
import com.stschools.practice.signup.entity.User;
import com.stschools.practice.signup.repository.RegisterRepository;
import com.stschools.practice.signup.service.RegisterService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements RegisterService {
    private final PasswordEncoder passwordEncoder;
    private final RegisterRepository repository;

    public RegisterServiceImpl(RegisterRepository repository,
                               PasswordEncoder passwordEncoder) {
        this.repository = repository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public RegisterResponse register(RegisterRequest request) {

        User user = new User();

        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setPhone(request.getPhone());
        user.setPassword(passwordEncoder.encode(request.getPassword()));

        User savedUser = repository.save(user);

        return new RegisterResponse(
                savedUser.getId(),
                savedUser.getName(),
                "Registration Successful"
        );
    }

}