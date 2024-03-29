package com.devjp.msscagrifarm.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VegetableDto {
    private UUID id;
    private String name;
    private String category;
    private Long weight;
}
