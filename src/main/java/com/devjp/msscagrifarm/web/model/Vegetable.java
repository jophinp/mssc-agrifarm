package com.devjp.msscagrifarm.web.model;

import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table (name = "vegetable")
public class Vegetable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "STRING")
    private int id;
    @Column
    private String name;
    @Column
    private String category;
    @Column(precision=10, scale=2)
    private Long weight;
}
