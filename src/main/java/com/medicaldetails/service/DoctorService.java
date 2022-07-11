package com.medicaldetails.service;

import com.medicaldetails.dto.DoctorRequestDTO;
import com.medicaldetails.model.Doctor;

public interface DoctorService {
    Doctor save(DoctorRequestDTO doctor);


    Doctor getDoctorByID(long id);

    //update
    Doctor updateDoctor(long id, Doctor doctorDetails);
}
