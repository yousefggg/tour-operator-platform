package com.touroperator.userservice.application.command;

import com.touroperator.userservice.domain.model.Role;

public record UpdateUserCommand(
        String email,
        Role role,
        Boolean active
) {
}