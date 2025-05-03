package com.oauth.jwt.authenticate.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.oauth.jwt.authenticate.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
