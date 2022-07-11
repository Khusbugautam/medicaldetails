package com.medicaldetails.service;


import com.medicaldetails.dto.AdminRequestDTO;
import com.medicaldetails.dto.AppointmentRequestDTO;

public interface AppointmentService {
    void save(AdminRequestDTO requestDTO);

    void save(AppointmentRequestDTO requestDTO);
}
