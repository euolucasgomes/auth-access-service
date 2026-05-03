package com.lucasgomes.auth_access_service.interfaces.http;

import com.lucasgomes.auth_access_service.application.usecase.CreateUserUseCase;
import com.lucasgomes.auth_access_service.domain.model.User;
import com.lucasgomes.auth_access_service.interfaces.http.request.CreateUserRequest;
import com.lucasgomes.auth_access_service.interfaces.http.response.UserResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final CreateUserUseCase createUserUseCase;

    public UserController(CreateUserUseCase createUserUseCase) {
        this.createUserUseCase = createUserUseCase;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponse create(@RequestBody CreateUserRequest request) {
        User user = createUserUseCase.execute(
                request.name(),
                request.email(),
                request.passwordHash()
        );

        return new UserResponse(
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getRole(),
                user.isActive()
        );
    }
}