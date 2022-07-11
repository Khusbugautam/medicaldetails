package com.medicaldetails.dto;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DoctorRequestDTO implements Serializable {

    @NotNull
    private String FullName;

    @NotNull
    private String Address;

    @NotNull
    private String Gender;

    @NotNull
    private String SpecializationNumber;

    @NotNull
    private String NmcNumber;
}
