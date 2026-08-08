package com.touroperator.userservice.application.dto;

import com.touroperator.userservice.domain.model.Role;

public record UserResponse(
        Long id,
        String email,
        Role role,
        boolean active
) {
}пш