package com.example.project3.model;



import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table
public class CarShop {
    @Id
    @Column(name = "carshopId")
    private int carshopId;
    private String location;

//    @OneToMany(mappedBy = "carShop")
//    @JsonIgnore
//    private List<Car> items = new ArrayList<>();
//@OneToMany(mappedBy = "bootcamp")
//private List<Student> items = new ArrayList<>();
@ManyToMany(mappedBy = "carShop")
@JsonIgnore
private List<Car> items = new ArrayList<>();

    public CarShop() {
    }

    public CarShop(int carshopId, String location) {
        this.carshopId = carshopId;
        this.location = location;
    }


    public List<Car> getItems() {
        return items;
    }

    public void setItems(List<Car> items) {
        this.items = items;
    }

    public int getCarshopId() {
        return carshopId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setCarshopId(int carshopId) {
        this.carshopId = carshopId;
    }
}
