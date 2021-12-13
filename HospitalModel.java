package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "hospitals")
public class HospitalModel {

    @Id
    private Integer id;
    private String name;

    //    @OneToMany(mappedBy = "hospital")
//    private List<PatientModel> patients;


    @ManyToMany(mappedBy = "hospital")
    @JsonIgnore
    private List<PatientModel> items = new ArrayList<>();

    public HospitalModel(Integer id, String name, List<PatientModel> items) {
        this.id = id;
        this.name = name;
        this.items = items;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<PatientModel> getItems() {
        return items;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setItems(List<PatientModel> items) {
        this.items = items;
    }
}