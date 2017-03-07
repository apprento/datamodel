package com.raja.repository;

import org.springframework.stereotype.Repository;

import com.raja.model.User;

@Repository
public interface UserRepository extends abstractRepository<User, Long> {

}
