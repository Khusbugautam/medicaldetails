package com.medicaldetails.service;

import com.medicaldetails.dto.PatientRequestDTO;
import com.medicaldetails.model.Patient;

public interface PatientService {

    void save(PatientRequestDTO requestDTO);

    Patient getpatientById(long id);

    Patient updatePatient(long id, Patient patientDetails);
}
