package com.medicaldetails.service.impl;

import com.medicaldetails.dto.DoctorRequestDTO;
import com.medicaldetails.exception.ResourceNotFoundException;
import com.medicaldetails.model.Doctor;
import com.medicaldetails.repository.DoctorRepository;
import com.medicaldetails.service.DoctorService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class DoctorServiceImpl implements DoctorService {
    private DoctorRepository doctorRepository;
    private Object hospitalRepository;

    public DoctorServiceImpl(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public void DoctorServiceImpl(DoctorService doctorService){this.doctorRepository=doctorRepository;}



    @Override
    public Doctor save(DoctorRequestDTO requestDTO) {
        Doctor doctor = saveDoctor(parseToDoctor(requestDTO));

        return doctor;
    }

    @Override
    public Doctor getDoctorByID(long id) {


        Doctor doctor = doctorRepository.findById(id)
                .orElse(null);

        return doctor;
    }
//update
    @Override
    public Doctor updateDoctor(long id, Doctor doctorDetails) {

        Doctor updateDoctor = doctorRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Doctor not exist with id: " + id));

        updateDoctor.setNmcNumber(doctorDetails.getNmcNumber());
        updateDoctor.setSpecializationNumber(doctorDetails.getSpecializationNumber());
        updateDoctor.setGender(doctorDetails.getGender());
        updateDoctor.setAddress(doctorDetails.getAddress());
        updateDoctor.setFullName(doctorDetails.getFullName());
        updateDoctor.setNmcNumber(updateDoctor.getNmcNumber());
        updateDoctor.setSpecializationNumber(doctorDetails.getSpecializationNumber());
        updateDoctor.setId(doctorDetails.getId());

        return updateDoctor;

    }
    //update patient

    Doctor doctor;
    Doctor saveDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);

    }

    private Doctor parseToDoctor(DoctorRequestDTO requestDTO) {
        Doctor doctor = new Doctor();
        doctor.setGender(requestDTO.getGender());
        doctor.setAddress(requestDTO.getAddress());
        doctor.setFullName(requestDTO.getFullName());
        doctor.setNmcNumber(requestDTO.getNmcNumber());
        doctor.setSpecializationNumber(requestDTO.getSpecializationNumber());

        return doctor;


    }
}






