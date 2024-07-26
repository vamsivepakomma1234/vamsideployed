package com.wipro.appointmentbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.appointmentbooking.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {



	
}

