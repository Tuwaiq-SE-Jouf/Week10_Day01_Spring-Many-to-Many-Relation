package com.example.project3.model;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class CarShopConfig {

    @Bean
    CommandLineRunner commandLineRunner(CarShopRepository repository){
        return args ->{
            CarShop jouf = new CarShop(1,"Sakaka");
            CarShop arar = new CarShop(2,"Arar");
            CarShop damam = new CarShop(3,"damam");
            CarShop riadhy = new CarShop(4,"riadhy");
            repository.saveAll(List.of(jouf,arar,damam,riadhy));

        };
    }
}
