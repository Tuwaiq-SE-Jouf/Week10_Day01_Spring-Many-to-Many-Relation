package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class HospitalService {

    @Autowired
    private HospitalRepository hospitalRepository;

    @Autowired
    private PatientRepository patientRepository;

    public List<HospitalModel> getAllHospitals(){
       return hospitalRepository.findAll();
    }

    public void addHospital(HospitalModel hospital){
        hospitalRepository.save(hospital);
    }

   @DeleteMapping(path = "delete/{hospitalId}")
    public void deleteHospital( Integer hospitaltId){
        hospitalRepository.deleteById(hospitaltId);
    }
}
