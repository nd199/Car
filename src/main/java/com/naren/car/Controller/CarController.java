package com.naren.car.Controller;

import com.naren.car.Entity.Car;
import com.naren.car.Entity.Owner;
import com.naren.car.Repository.CarRepository;
import com.naren.car.Repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private OwnerRepository ownerRepository;


    @PostMapping("/car")
    public Car cars(@RequestBody Car car) {
        return carRepository.save(car);
    }


    @GetMapping("/cars")
    public List<Car> getCars() {
        return carRepository.findAll();
    }

    @PutMapping("/cars/{carId}/owners/{ownerId}")
    public Car assignCarToOwner(@PathVariable Long carId, @PathVariable Long ownerId) {

        Car car = carRepository.findById(carId).get();
        Owner owner = ownerRepository.findById(ownerId).get();
        car.setOwner(owner);
        return carRepository.save(car);
    }

}
