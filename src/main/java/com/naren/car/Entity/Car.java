package com.naren.car.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "car")
@Data
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long carId;

    @Column(name = "brand", nullable = false)
    private String brand;

    @Column(name = "model", nullable = false)
    private String model;

    @Column(name = "color", nullable = false)
    private String color;

    @Column(name = "register_number", nullable = false, unique = true)
    private String registerNumber;

    @Column(name = "year", nullable = false)
    private Integer year;

    @Column(name = "price", nullable = false)
    private Integer price;

    @ManyToOne
    @JoinColumn(name = "owner")
    private Owner owner;

}