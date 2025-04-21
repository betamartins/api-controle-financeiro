package com.betamartins.controlefinanceiro.service.movementType;

import com.betamartins.controlefinanceiro.model.movementType.dto.ReturnMovementTypeDto;
import com.betamartins.controlefinanceiro.repository.movementType.MovementTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovementTypeService {

    @Autowired
    private MovementTypeRepository movementTypeRepository;

    public List<ReturnMovementTypeDto> findAll(){
        return this.movementTypeRepository.findAllByStatusMovementTrue().stream().map(ReturnMovementTypeDto::new).toList();
    }

}
