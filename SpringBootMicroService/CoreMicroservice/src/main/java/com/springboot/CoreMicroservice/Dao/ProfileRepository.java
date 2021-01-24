package com.springboot.CoreMicroservice.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.CoreMicroservice.Entity.EmployeeProfile;

@Repository
public interface ProfileRepository extends JpaRepository < EmployeeProfile, Integer > {
    
}
