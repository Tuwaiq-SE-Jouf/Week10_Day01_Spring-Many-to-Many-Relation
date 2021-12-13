package com.example.demo.model;


import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "patients")
//@JsonIdentityInfo(generator = =ObjectIdGenerators.property = )
public class PatientModel {
    //p-key
    @Id
    private Integer id;
    private String name;
    private String email;

//    @ManyToOne()
//    //f-key
//    @JoinColumn(name = "hospital_id", referencedColumnName = "id")
//    private HospitalModel hospital;

    @ManyToMany
    @JoinTable(name = "Hospital_patient",
            joinColumns = @JoinColumn(name = "hospitalId"),
            inverseJoinColumns = @JoinColumn(name = "PatientId"))
    private List<PatientModel> Patient;

//    public PatientModel(Integer id, String name, String email, HospitalModel hospital) {
//        this.id = id;
//        this.name = name;
//        this.email = email;
//        this.hospital = hospital;
//    }

    public PatientModel(Integer id, String name, String email, List<PatientModel> patient) {
        this.id = id;
        this.name = name;
        this.email = email;
        Patient = patient;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<PatientModel> getPatient() {
        return Patient;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPatient(List<PatientModel> patient) {
        Patient = patient;
    }

    @Override
    public String toString() {
        return "PatientModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", Patient=" + Patient +
                '}';
    }

}

