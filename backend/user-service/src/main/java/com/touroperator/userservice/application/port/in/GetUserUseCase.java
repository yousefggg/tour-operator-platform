package com.touroperator.userservice.application.port.in;

import com.touroperator.userservice.application.dto.UserResponse;

public interface GetUserUseCase {

    UserResponse getById(Long id);
}