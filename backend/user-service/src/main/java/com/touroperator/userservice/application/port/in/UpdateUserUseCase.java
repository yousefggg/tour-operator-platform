package com.touroperator.userservice.application.port.in;

import com.touroperator.userservice.application.command.UpdateUserCommand;
import com.touroperator.userservice.application.dto.UserResponse;

public interface UpdateUserUseCase {

    UserResponse update(Long id, UpdateUserCommand command);
}