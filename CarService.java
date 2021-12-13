package com.example.project3.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    private CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public void deleteCar(Integer carId) {
        carRepository.deleteById(carId);
        //boolean exist = studentRepository.existsById(studentId);
        // put a condition on 'exist'. if exist then delete
    }
    public void addNewCar(Car car) {
        carRepository.save(car);
    }

    public List<Car> getCars() {
        return carRepository.findAll();
    }
}