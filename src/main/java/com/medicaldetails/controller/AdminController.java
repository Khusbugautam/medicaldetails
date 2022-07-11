package com.medicaldetails.controller;

import com.medicaldetails.dto.AdminRequestDTO;
import com.medicaldetails.service.AdminService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/admin")
@RestController
public class AdminController {
    private final AdminService adminService;


    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping("/save")
    public void save(@RequestBody AdminRequestDTO requestDTO) {
        adminService.save(requestDTO);
    }

}