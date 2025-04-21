package com.betamartins.controlefinanceiro.model.movementType.dto;

import com.betamartins.controlefinanceiro.model.movementType.TransactionType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record MovementTypeDto(
        @NotBlank @NotNull String name,
        @NotNull TransactionType transactionType
) {
}
