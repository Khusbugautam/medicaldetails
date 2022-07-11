package com.medicaldetails.service.impl;

import com.medicaldetails.dto.AdminRequestDTO;
import com.medicaldetails.dto.AppointmentRequestDTO;
import com.medicaldetails.model.Appointment;
import com.medicaldetails.repository.AppointmentRepository;
import com.medicaldetails.service.AppointmentService;
import org.springframework.stereotype.Service;

@Service

public class AppointmentServiceImpl implements AppointmentService {
    private AppointmentRepository appointmentRepository;

    public AppointmentServiceImpl(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    @Override
    public void save(AdminRequestDTO requestDTO) {


    }

    @Override
    public void save(AppointmentRequestDTO requestDTO){
        Appointment appointment=saveAppointment(parseToAppointment(requestDTO));

    }
    private Appointment saveAppointment(Appointment appointment){
        return appointmentRepository.save(appointment);
    }
    private Appointment parseToAppointment(AppointmentRequestDTO requestDTO) {
        Appointment  appointment=new Appointment();
        appointment.setPatientID(requestDTO.getPatientID());
        appointment.setDoctorID(requestDTO.getDoctorID());
        appointment.setTime(requestDTO.getTime());
        appointment.setUniqueNumber(requestDTO.getUniqueNumber());
        return appointment;
    }
}
