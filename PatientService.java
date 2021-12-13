package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;


    public List<PatientModel> getAllPatients(){
        return patientRepository.findAll();
    }

    // هذا علشان اقدر اضيف patinet جديد
    public void addPatient(PatientModel patient){
        patientRepository.save(patient);
    }

    public void deletePatient(Integer patientId) {
        patientRepository.deleteById(patientId);
    }
}
