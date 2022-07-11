package com.medicaldetails.service.impl;

import com.medicaldetails.dto.HospitalRequestDTO;
import com.medicaldetails.model.Hospital;
import com.medicaldetails.repository.HospitalRepository;
import com.medicaldetails.service.HospitalService;
import org.springframework.stereotype.Service;

@Service
public class HospitalServiceImpl implements HospitalService {
    private HospitalRepository hospitalRepository;

    public HospitalServiceImpl(HospitalRepository hospitalRepository) {
        this.hospitalRepository = hospitalRepository;
    }
    @Override
    public void save (HospitalRequestDTO requestDTO){
        Hospital hospital=saveHospital(parseToHospital(requestDTO));
    }
    private Hospital saveHospital(Hospital hospital){
        return hospitalRepository.save(hospital);
    }
private Hospital parseToHospital(HospitalRequestDTO requestDTO){
        Hospital hospital=new Hospital();
        hospital.setName(requestDTO.getName());
        hospital.setAddress(requestDTO.getAddress());
        hospital.setPanNumber(requestDTO.getPanNumber());
        hospital.setPhoneNumber(requestDTO.getPhoneNumber());
        return hospital;
}
}
