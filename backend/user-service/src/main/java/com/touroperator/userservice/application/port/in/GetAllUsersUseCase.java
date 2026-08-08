package com.touroperator.userservice.application.port.in;

import com.touroperator.userservice.application.dto.UserResponse;

import java.util.List;

public interface GetAllUsersUseCase {

    List<UserResponse> getAll();
}