package com.devjp.msscagrifarm.web.controller;

import com.devjp.msscagrifarm.services.VegetableService;
import com.devjp.msscagrifarm.web.model.VegetableDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/api/v1/vegetable")
@RestController
public class VegetableController {

    private final VegetableService vegetableService;

    public VegetableController(VegetableService vegetableService) {
        this.vegetableService = vegetableService;
    }

    @GetMapping({"/{vegetableId}"})
    public ResponseEntity<VegetableDto> getVegetable(@PathVariable("vegetableId") UUID vegetableId){
        return new ResponseEntity<>(vegetableService.getVegetableId(vegetableId), HttpStatus.OK);
    }

}
