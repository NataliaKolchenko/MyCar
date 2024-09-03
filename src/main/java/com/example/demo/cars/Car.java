package com.example.demo.cars;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length=30)
    private String brand;
    private String model;
    private int releaseYear;
    private String countryOfManufacture;
    @Column(nullable = false)
    private Long engineerId;
    private LocalDateTime createDate;

    public Car(String brand, Long engineerId) {
        this.brand = brand;
        this.engineerId = engineerId;
        this.createDate = LocalDateTime.now();
    }

    public Car() {
        this.createDate = LocalDateTime.now();
    }
}
