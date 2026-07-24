package com.touroperator.user_service.domain.exception;

public class UserAlreadyExistsException extends DomainException {
    public UserAlreadyExistsException(String email) {
        super("User already exists with email: " + email);
    }
}