package com.naren.car.Controller;

import com.naren.car.Entity.Owner;
import com.naren.car.Repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class OwnerController {

    @Autowired
    private OwnerRepository ownerRepository;

    @PostMapping("/owner")
    public Owner owner(@RequestBody Owner owner) {
        return ownerRepository.save(owner);
    }

    @GetMapping("/owners")
    public List<Owner> getOwners() {
        return ownerRepository.findAll();
    }


}
