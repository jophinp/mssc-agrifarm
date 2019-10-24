package com.devjp.msscagrifarm.web.controller;

import com.devjp.msscagrifarm.services.VegetableService;
import com.devjp.msscagrifarm.web.model.VegetableDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public ResponseEntity handlePost(@RequestBody VegetableDto vegetableDto){
        VegetableDto saveDto = vegetableService.saveVegetable(vegetableDto);
        HttpHeaders httpHeaders  = new HttpHeaders();
        //todo add hostname to url
        httpHeaders.add("Location", "/api/v1/vegetable/" + saveDto.getId().toString());
        return new ResponseEntity(httpHeaders, HttpStatus.CREATED);
    }

    @PutMapping({"/{vegetableId}"})
    public ResponseEntity handleUpdate(@PathVariable("vegetableId") UUID vegetableId, @RequestBody VegetableDto vegetableDto){
        vegetableService.updateVegetable(vegetableId, vegetableDto);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping({"/{vegetableId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteVegetable(@PathVariable("vegetableId") UUID vegetableId){
        vegetableService.deleteById(vegetableId);
    }
}
