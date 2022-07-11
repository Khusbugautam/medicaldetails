package com.medicaldetails.controller;

import com.medicaldetails.dto.AppointmentRequestDTO;
import com.medicaldetails.service.AppointmentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/appointment")
@RestController
public class AppointmentController {
private final AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }
    @PostMapping("/save")
    public void save(@RequestBody AppointmentRequestDTO requestDTO){
        appointmentService.save(requestDTO);
    }
}
