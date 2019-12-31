package com.devjp.msscagrifarm.web.Dao;

import com.devjp.msscagrifarm.web.model.Vegetable;

import java.util.List;
import java.util.UUID;

public interface VegetableDao {
    List<Vegetable> get();

    Vegetable get(UUID id);

    void save(Vegetable vegetable);

    void delete(UUID id);
}
