package com.touroperator.user_service.application.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RegisterUserRequest {

    @Email
    @NotBlank
    private String email;

    @NotBlank
    @Size(min = 8)
    private String password;
}