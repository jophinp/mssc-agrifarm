package com.devjp.msscagrifarm.services;

import com.devjp.msscagrifarm.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerId(UUID customerId);
}
