package com.stschools.practice.signup.repository;

import com.stschools.practice.signup.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterRepository extends JpaRepository<User,Integer> {

}