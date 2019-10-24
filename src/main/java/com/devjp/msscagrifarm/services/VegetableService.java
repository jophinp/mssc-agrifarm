package com.devjp.msscagrifarm.services;

import com.devjp.msscagrifarm.web.model.VegetableDto;

import java.util.UUID;

public interface VegetableService {
    VegetableDto getVegetableId(UUID vegetableId);
}
