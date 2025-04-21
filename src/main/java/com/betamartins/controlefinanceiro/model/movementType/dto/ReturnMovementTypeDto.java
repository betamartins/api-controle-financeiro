package com.betamartins.controlefinanceiro.model.movementType.dto;

import com.betamartins.controlefinanceiro.model.movementType.MovementType;

public record ReturnMovementTypeDto(
        Long id,
        String name,
        String type
) {
    public ReturnMovementTypeDto(MovementType movementType){
        this(
            movementType.getId(),
            movementType.getName(),
            movementType.getTransactionType().getTransactionDescription()
        );
    }
}
