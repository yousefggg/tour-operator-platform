package com.touroperator.userservice.application.command;

public record RegisterUserCommand(
        String email,
        String password
) {
}