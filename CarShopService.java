package com.example.project3.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarShopService {
    private CarShopRepository carShopRepository;

    @Autowired
    public CarShopService(CarShopRepository carShopRepository) {
        this.carShopRepository = carShopRepository;
    }


    public List<CarShop> getCarShops() {
        return carShopRepository.findAll();
    }

    public void addNewCarShop(CarShop carShop) {
        carShopRepository.save(carShop);
    }
}