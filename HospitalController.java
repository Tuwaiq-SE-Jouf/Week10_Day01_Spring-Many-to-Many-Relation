package com.example.demo.controller;

import com.example.demo.model.HospitalModel;
import com.example.demo.model.HospitalService;
import com.example.demo.model.PatientModel;
import com.example.demo.model.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "hospitals")
public class HospitalController {

    @Autowired
    private HospitalService hospitalService;

    @GetMapping(path = "getAll")
    public List<HospitalModel> getAllHospitals() {
        return hospitalService.getAllHospitals();
    }

    @PostMapping(path = "add")
    public void addHospital(@RequestBody HospitalModel hospital) {
        hospitalService.addHospital(hospital);
    }


    @DeleteMapping(path = "delete/{hospitalId}")
    public void deleteHospital(@PathVariable ("hospitalId") Integer hospitalId) {
        hospitalService.deleteHospital(hospitalId);
    }
}