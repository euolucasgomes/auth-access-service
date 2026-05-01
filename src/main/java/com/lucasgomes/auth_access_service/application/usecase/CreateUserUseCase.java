package com.lucasgomes.auth_access_service.application.usecase;

import com.lucasgomes.auth_access_service.domain.model.User;
import com.lucasgomes.auth_access_service.domain.model.UserRole;

import java.util.UUID;

public class CreateUserUseCase {

    public User execute(String name, String email, String passwordHash) {

        return new User(
                UUID.randomUUID(),
                name,
                email,
                passwordHash,
                UserRole.USER,
                true
        );
    }
}