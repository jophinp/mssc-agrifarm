package com.devjp.msscagrifarm.services;

import com.devjp.msscagrifarm.web.model.Vegetable;
import com.devjp.msscagrifarm.web.model.VegetableDto;

import java.util.List;
import java.util.UUID;

public interface VegetableService {

    List<Vegetable> get();

    void save(Vegetable vegetable);

    VegetableDto getVegetableId(UUID vegetableId);

    VegetableDto saveVegetable(VegetableDto vegetableDto);

    VegetableDto saveVegetable(Vegetable vegetable);

    void updateVegetable(UUID vegetableId, VegetableDto vegetableDto);

    void deleteById(UUID vegetableId);
}
