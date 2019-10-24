package com.devjp.msscagrifarm.services;

import com.devjp.msscagrifarm.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerId(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Jophin P")
                .phone("7745599019")
                .build();
    }
}
