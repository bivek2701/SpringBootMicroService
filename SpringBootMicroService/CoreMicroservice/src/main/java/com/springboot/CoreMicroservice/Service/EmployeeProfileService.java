package com.springboot.CoreMicroservice.Service;

import java.util.List;

import com.springboot.CoreMicroservice.Entity.EmployeeProfile;

public interface EmployeeProfileService {
	
    void addEmployeeProfile(EmployeeProfile profile);
    List < EmployeeProfile > getEmployeeProfiles();
}
