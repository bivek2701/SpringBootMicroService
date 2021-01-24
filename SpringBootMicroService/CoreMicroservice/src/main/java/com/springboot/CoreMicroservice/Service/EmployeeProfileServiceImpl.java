package com.springboot.CoreMicroservice.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.CoreMicroservice.Dao.ProfileRepository;
import com.springboot.CoreMicroservice.Entity.EmployeeProfile;

@Service
public class EmployeeProfileServiceImpl implements EmployeeProfileService {

    @Autowired
    ProfileRepository repository;
    List < EmployeeProfile > employeeProfileList = new ArrayList < > ();

    @Override
    public void addEmployeeProfile(EmployeeProfile profile) {
        repository.save(profile);
    }

    @Override
    public List < EmployeeProfile > getEmployeeProfiles() {
        return repository.findAll();
    }
}
