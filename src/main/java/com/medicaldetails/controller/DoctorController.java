package com.medicaldetails.controller;

import com.medicaldetails.dto.DoctorRequestDTO;
import com.medicaldetails.service.DoctorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/doctor")
@RestController
public class DoctorController {
    private final DoctorService doctorService;
    public DoctorController(DoctorService doctorService){
        this.doctorService=doctorService;
    }
    @PostMapping("/save")
    public void save(@RequestBody DoctorRequestDTO requestDTO) {
        doctorService.save(requestDTO);
    }
}
