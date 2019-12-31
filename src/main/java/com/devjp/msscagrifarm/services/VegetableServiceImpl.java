package com.devjp.msscagrifarm.services;

import com.devjp.msscagrifarm.web.Dao.VegetableDao;
import com.devjp.msscagrifarm.web.model.Vegetable;
import com.devjp.msscagrifarm.web.model.VegetableDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Slf4j
@Service
public class VegetableServiceImpl implements VegetableService {
    @Autowired
    private VegetableDao vegetableDao;

    @Transactional
    @Override
    public List<Vegetable> get() {
        return vegetableDao.get();
    }

    @Transactional
    @Override
    public void save(Vegetable vegetable) {
        vegetableDao.save(vegetable);
    }

    @Transactional
    @Override
    public VegetableDto getVegetableId(UUID vegetableId) {
        return VegetableDto.builder().id(UUID.randomUUID())
                .name("Potatoes")
                .category("Root")
                .weight((long)500.4)
                .build();
    }

    @Transactional
    @Override
    public VegetableDto saveVegetable(VegetableDto vegetableDto) {
        return VegetableDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Transactional
    @Override
    public VegetableDto saveVegetable(Vegetable vegetable) {
        return null;
    }

    @Transactional
    @Override
    public void updateVegetable(UUID vegetableId, VegetableDto vegetableDto) {
        //todo impl - add real update
    }

    @Transactional
    @Override
    public void deleteById(UUID vegetableId) {
      log.debug("Deleting Vegetable");
    }
}
