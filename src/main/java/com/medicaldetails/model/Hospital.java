package com.medicaldetails.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.security.PrivateKey;

@Table(name = "hospital")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Hospital implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private  String name;
    @Column(name = "panNumber")
    private String panNumber;
    @Column(name = "address")
    private String address;
    @Column(name = "phoneNumber")
    private String phoneNumber;
}
