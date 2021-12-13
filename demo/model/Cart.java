package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Cart {
    @Id
    @Column(name ="id")
            private int id;
    private String name;
    @ManyToMany(mappedBy = "cart")
    @JsonIgnore
    private List<Product> product = new ArrayList<>();


    public Cart(int id, String name, List<Product> product) {
        this.id = id;
        this.name = name;
        this.product = product;
    }


    public Cart() {
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
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
}
