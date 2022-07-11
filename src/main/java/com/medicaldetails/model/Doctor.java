package com.medicaldetails.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "doctor")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Doctor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "address")
    private String address;

    @Column(name = "gender")
    private String gender;

    @Column(name = "specialization_number")
    private String specializationNumber;

    @Column(name = "nmc_number")
    private String nmcNumber;
}
