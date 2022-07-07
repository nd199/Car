package com.naren.car.Repository;

import com.naren.car.Entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {

    List<Car> findByBrand(String brand);

    List<Car> findByColor(String color);

    List<Car> findByYear(Integer year);

    List<Car> findByYearAndBrand(Integer year, String brand);

    List<Car> findByBrandOrColor(String brand, String color);


}