package com.example.caseStudy.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name="products")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @NotNull
    private Long id;
    @NotNull
    private int count;
    @NotNull
    private String name;
    @NotNull
    private Double price;
    @NotNull
    private int temperature;

    private String img;
    @NotNull
    private int capacity;
}
