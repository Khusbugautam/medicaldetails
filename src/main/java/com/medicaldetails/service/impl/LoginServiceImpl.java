package com.medicaldetails.service.impl;

import com.medicaldetails.dto.LoginRequestDTO;
import com.medicaldetails.model.Admin;
import com.medicaldetails.repository.AdminRepository;
import com.medicaldetails.service.LoginService;
import org.springframework.stereotype.Service;
@Service
public class LoginServiceImpl implements LoginService {

    private final AdminRepository adminRepository;

    public LoginServiceImpl(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }


    @Override
    public String loginUser(LoginRequestDTO loginRequestDTO) {

        //find Admin by username
        Admin admin=adminRepository.findAdminByUsername(loginRequestDTO.getUsername());

        //todo
        //check request ko username password to admin table ko username ra password
        String response="";
        if(loginRequestDTO.getUsername().equals(admin.getUsername())
                && loginRequestDTO.getPassword().equals(admin.getPassword())){

            response="SUCCESS";
        }else{
            response="FAILED";
        }

        return response;
    }
}
