package com.lucasgomes.auth_access_service.domain.model;

import java.util.UUID;

public class User {

    private UUID id;
    private String name;
    private String email;
    private String passwordHash;
    private UserRole role;
    private boolean active;

    public User(UUID id, String name, String email, String passwordHash, UserRole role, boolean active) {
        validate(name, email, passwordHash, role);

        this.id = id;
        this.name = name;
        this.email = email;
        this.passwordHash = passwordHash;
        this.role = role;
        this.active = active;
    }

    private void validate(String name, String email, String passwordHash, UserRole role) {

        if (isBlank(name)) {
            throw new IllegalArgumentException("Name cannot be null or blank");
        }

        if (isBlank(email)) {
            throw new IllegalArgumentException("Email cannot be null or blank");
        }

        if (isBlank(passwordHash)) {
            throw new IllegalArgumentException("Password hash cannot be null or blank");
        }

        if (role == null) {
            throw new IllegalArgumentException("User role cannot be null");
        }
    }

    private boolean isBlank(String value) {
        return value == null || value.trim().isEmpty();
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public UserRole getRole() {
        return role;
    }

    public boolean isActive() {
        return active;
    }
}