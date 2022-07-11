package com.medicaldetails.controller;

import com.medicaldetails.dto.LoginRequestDTO;
import com.medicaldetails.service.LoginService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/login")
@RestController
public class LoginController {

    private final LoginService loginService;


    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping
    public String loginUser(@RequestBody LoginRequestDTO loginRequestDTO) {

        return loginService.loginUser(loginRequestDTO);

    }


}
