package com.medicaldetails.service.impl;

import com.medicaldetails.dto.AdminRequestDTO;
import com.medicaldetails.model.Admin;
import com.medicaldetails.repository.AdminRepository;
import com.medicaldetails.service.AdminService;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    private AdminRepository adminRepository;

    public AdminServiceImpl(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;}
    @Override
    public void save(AdminRequestDTO requestDTO){
        Admin admin=saveAdmin(parseToAdmin(requestDTO));

    }
    private Admin saveAdmin(Admin admin){
        return adminRepository.save(admin);
    }
    private Admin parseToAdmin(AdminRequestDTO requestDTO) {
        Admin admin=new Admin();
        admin.setName(requestDTO.getName());
        admin.setUsername(requestDTO.getUsername());
        admin.setPhoneNumber(requestDTO.getPhone());
        admin.setPassword(requestDTO.getPassword());
        admin.setStatus("active");
        return admin;
    }
}
