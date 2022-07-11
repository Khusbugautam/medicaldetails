package com.medicaldetails.controller;

import com.medicaldetails.dto.PatientRequestDTO;
import com.medicaldetails.exception.ResourceNotFoundException;
import com.medicaldetails.model.Patient;
import com.medicaldetails.repository.PatientRepository;
import com.medicaldetails.service.PatientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/patient")
@RestController
public class PatientController {
    private final PatientService patientService;

    private final PatientRepository patientRepository;

    public PatientController(PatientService patientService, PatientRepository patientRepository) {
        this.patientService = patientService;
        this.patientRepository = patientRepository;
    }


    @PostMapping("/save")
    public void save(@RequestBody PatientRequestDTO requestDTO){
        patientService.save(requestDTO);
    }


    @GetMapping("{id}")
    public ResponseEntity<Patient> getpatientById(@PathVariable  long id){
        Patient patient= patientService.getpatientById(id);
        return ResponseEntity.ok(patient);
    }

    // update
    @PutMapping("{id}")
    public ResponseEntity<Patient> updatePatient(@PathVariable long id,@RequestBody Patient patientDetails) {
        Patient updatePatient = patientService.updatePatient(id,patientDetails);
        return ResponseEntity.ok(updatePatient);
    }

    // delete
    @DeleteMapping("{id}")
    public ResponseEntity<Patient> deletePatient(@PathVariable long id){
        Patient patient = patientRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Patient not exist with id: " + id));
     patientRepository.delete(patient);

        return ResponseEntity.ok(patient);
    }
}

