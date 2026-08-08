package com.touroperator.userservice.domain.exception;

public class UserAlreadyExist extends RuntimeException {
  public UserAlreadyExist(String message) {
    super(message);
  }
}
