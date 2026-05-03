package com.lucasgomes.auth_access_service.interfaces.http.response;

import com.lucasgomes.auth_access_service.domain.model.UserRole;

import java.util.UUID;

public record UserResponse(
        UUID id,
        String name,
        String email,
        UserRole role,
        boolean active
) {
}