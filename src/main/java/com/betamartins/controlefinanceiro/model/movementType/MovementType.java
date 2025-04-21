package com.betamartins.controlefinanceiro.model.movementType;

import com.betamartins.controlefinanceiro.model.movementType.dto.MovementTypeDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "MovementType")
@Table(name = "movement_type")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Getter
public class MovementType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "TYPE")
    @Enumerated(EnumType.ORDINAL)
    private TransactionType transactionType;

    private Boolean statusMovement;

    public MovementType(MovementTypeDto dto){
        this.name = dto.name();
        this.transactionType = dto.transactionType();
        this.statusMovement = true;
    }

    public void deleteMovementType(){
        this.statusMovement = false;
    }

}
