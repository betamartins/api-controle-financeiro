package com.betamartins.controlefinanceiro.model.user.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record UserAuthData(
        @NotBlank @Email String login,
        @NotBlank String password
) {
}
