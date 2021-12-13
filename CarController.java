package com.example.project3.controller;

import com.example.project3.model.CarService;
import com.example.project3.model.Car;
import com.example.project3.model.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/car")
public class CarController {
    private CarService CarService;

    @Autowired
    public CarController(CarService CarService) {
        this.CarService = CarService;
    }

    @GetMapping
    public List<Car> getCars() {
        return CarService.getCars();
    }

    @PostMapping(path = "add")
    public void registerNewCar(@RequestBody Car Car){
        CarService.addNewCar(Car);
    }

    @DeleteMapping(path = "delete/{carId}")
    public void deleteCar(@PathVariable ("carId") Integer carId){
        CarService.deleteCar(carId);
    }
}