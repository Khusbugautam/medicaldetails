package com.medicaldetails.service.impl;

import com.medicaldetails.dto.AdminRequestDTO;
import com.medicaldetails.dto.PatientRequestDTO;
import com.medicaldetails.exception.ResourceNotFoundException;
import com.medicaldetails.model.Patient;
import com.medicaldetails.repository.PatientRepository;
import com.medicaldetails.service.PatientService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class PatientServiceImpl implements PatientService {
    private PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public void save(PatientRequestDTO requestDTO) {
        Patient patient = savePatinet(parseTopatinet(requestDTO));

    }

    @Override
    public Patient getpatientById(long id) {


        Patient patient = patientRepository.findById(id)
                .orElse(null);

        return patient;
    }

    @Override
    public Patient updatePatient(long id, Patient patientDetails) {

        Patient updatePatient = patientRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Patient not exist with id: " + id));

        updatePatient.setPatientNumber(patientDetails.getPatientNumber());
        updatePatient.setDateOfBirth(patientDetails.getDateOfBirth());
        updatePatient.setGender(patientDetails.getGender());
        updatePatient.setAddress(patientDetails.getAddress());
        updatePatient.setBloodGroup(patientDetails.getBloodGroup());
        updatePatient.setFullName(patientDetails.getFullName());

        return updatePatient;

    }
//update patient
    private Patient savePatinet(Patient patient) {
        return patientRepository.save(patient);

    }

    private Patient parseTopatinet(PatientRequestDTO requestDTO) {
        Patient patient = new Patient();
        patient.setFullName(requestDTO.getFullName());
        patient.setAddress(requestDTO.getAddress());
        patient.setGender(requestDTO.getGender());
        patient.setBloodGroup(requestDTO.getBloodGroup());
        patient.setDateOfBirth(requestDTO.getDateOfBirth());
        patient.setPatientNumber(requestDTO.getPatientNumber());
        return patient;


    }
}

