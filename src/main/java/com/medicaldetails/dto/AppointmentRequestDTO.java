package com.medicaldetails.dto;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AppointmentRequestDTO {
    @NotNull
    private String patientID;

    @NotNull
    private String doctorID;

    @NotNull
    private String time;

    @NotNull
    private String uniqueNumber;
}
