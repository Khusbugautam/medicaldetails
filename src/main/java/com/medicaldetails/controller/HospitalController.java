package com.medicaldetails.controller;

import com.medicaldetails.dto.HospitalRequestDTO;
import com.medicaldetails.model.Hospital;
import com.medicaldetails.service.HospitalService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hospital")
@RestController
public class HospitalController {
    private final HospitalService hospitalService;

    public HospitalController(HospitalService hospitalService) {
        this.hospitalService = hospitalService;
    }
    @PostMapping("/save")
    public void save(@RequestBody HospitalRequestDTO requestDTO){
        hospitalService.save(requestDTO);

    }
}
