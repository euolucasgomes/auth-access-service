package com.lucasgomes.auth_access_service.interfaces.http.request;

public record CreateUserRequest(
        String name,
        String email,
        String passwordHash
) {
}