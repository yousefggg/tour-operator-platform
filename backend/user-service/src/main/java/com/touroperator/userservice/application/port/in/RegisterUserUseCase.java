package com.touroperator.userservice.application.port.in;

import com.touroperator.userservice.application.command.RegisterUserCommand;
import com.touroperator.userservice.application.dto.UserResponse;

public interface RegisterUserUseCase {

    UserResponse register(RegisterUserCommand command);
}