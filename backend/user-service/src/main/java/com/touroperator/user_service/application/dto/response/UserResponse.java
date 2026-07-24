package com.touroperator.user_service.application.dto.response;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserResponse {

    private Long id;
    private String email;
    private String role;
    private boolean active;
}