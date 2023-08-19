package com.example.caseStudy.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="machine")
@Data
public class Machine {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private double totalBalance;
}
