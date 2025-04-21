package com.betamartins.controlefinanceiro.repository.movementType;

import com.betamartins.controlefinanceiro.model.movementType.MovementType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovementTypeRepository extends JpaRepository<MovementType, Long> {

    Boolean existsByIdAndStatusMovementTrue(Long movementId);

    List<MovementType> findAllByStatusMovementTrue();
}
