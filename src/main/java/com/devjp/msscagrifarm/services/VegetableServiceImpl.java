package com.devjp.msscagrifarm.services;

import com.devjp.msscagrifarm.web.model.VegetableDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class VegetableServiceImpl implements VegetableService {
    @Override
    public VegetableDto getVegetableId(UUID vegetableId) {
        return VegetableDto.builder().id(UUID.randomUUID())
                .name("Potatoes")
                .category("Root")
                .weight((long)500.4)
                .build();
    }

    @Override
    public VegetableDto saveVegetable(VegetableDto vegetableDto) {
        return VegetableDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateVegetable(UUID vegetableId, VegetableDto vegetableDto) {
        //todo impl - add real update
    }

    @Override
    public void deleteById(UUID vegetableId) {
      log.debug("Deleting Vegetable");
    }
}
