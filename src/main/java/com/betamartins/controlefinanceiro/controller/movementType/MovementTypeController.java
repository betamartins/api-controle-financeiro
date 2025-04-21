package com.betamartins.controlefinanceiro.controller.movementType;

import com.betamartins.controlefinanceiro.service.movementType.MovementTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movementType")
public class MovementTypeController {

    @Autowired
    private MovementTypeService movementTypeService;

    @GetMapping()
    public ResponseEntity<?> findAll(){
        var returnList = this.movementTypeService.findAll();
        return ResponseEntity.ok(returnList);
    }

}
