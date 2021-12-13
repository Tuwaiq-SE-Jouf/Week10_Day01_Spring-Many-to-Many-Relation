package com.example.project3.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
public class Car {

    @Id
    private int id;
    private String name;
    private String color;
    private int model;

//    @ManyToOne
//    @JoinColumn(name = "CarShop_id",referencedColumnName="carshopId")
//    private CarShop carShop;
@ManyToMany
@JoinTable(name = "Car_CarShop",
        joinColumns = @JoinColumn(name = "carId"),
        inverseJoinColumns = @JoinColumn(name = "carshopId"))
private List<CarShop> carShop;

//    public Car(int id, String name, String color, int model, CarShop carShop) {
//        this.id = id;
//        this.name = name ;
//        this.color = color;
//        this.model = model;
//        this.carShop = carShop;
//    }


    public Car(int id, String name, String color, int model, List<CarShop> carShop) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.model = model;
        this.carShop = carShop;
    }

    public Car() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

//    public CarShop getCarShop() {
//        return carShop;
//    }
//
//    public void setCarShop(CarShop carShop) {
//        this.carShop = carShop;
//    }

    public List<CarShop> getCarShop() {
        return carShop;
    }

    public void setCarShop(List<CarShop> carShop) {
        this.carShop = carShop;
    }

    @Override
    public String toString() {
        return "Car{" +

                ", id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", model=" + model +
                ", carShop=" + carShop +
                '}';
    }
}
