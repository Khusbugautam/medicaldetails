package com.medicaldetails.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "Appointment")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Appointment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "patientID")
    private String patientID;

    @Column(name = "doctorID")
    private String doctorID;

    @Column(name = "time")
    private String time;

    @Column(name = "uniqueNumber")
    private String uniqueNumber;
}
