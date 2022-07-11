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
public class HospitalRequestDTO implements Serializable {
   @NotNull
   private String name;

    @NotNull
    private String panNumber;

    @NotNull
    private String address;

    @NotNull
    private String phoneNumber;

}
