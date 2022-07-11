package com.medicaldetails.service;

import com.medicaldetails.dto.LoginRequestDTO;

public interface LoginService {
    String loginUser(LoginRequestDTO loginRequestDTO);
}
