package com.example.demo.controller;

import com.example.demo.model.PatientModel;
import com.example.demo.model.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "patients")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping(path = "getAll")
    public List<PatientModel> getAllPatients() {
        return patientService.getAllPatients();
    }

    @PostMapping(path = "add")
    public void addPatient(@RequestBody PatientModel patient) {
        // هذا استدعيناه من الservice
        patientService.addPatient(patient);
    }

    @DeleteMapping(path = "delete/{patientId}")
    public void deletePatient(@PathVariable("patientId") Integer patientId) {
        patientService.deletePatient(patientId);
    }

}