package com.devjp.msscagrifarm.services;

import com.devjp.msscagrifarm.web.model.VegetableDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class VegetableServiceImpl implements VegetableService {
    @Override
    public VegetableDto getVegetableId(UUID vegetableId) {
        return VegetableDto.builder().id(UUID.randomUUID())
                .name("Potato")
                .category("Root")
                .weight((long)500.4)
                .build();
    }
}
