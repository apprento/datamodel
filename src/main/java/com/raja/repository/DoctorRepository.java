package com.raja.repository;

import org.springframework.stereotype.Repository;

import com.raja.model.Doctor;

@Repository
public interface DoctorRepository extends abstractRepository<Doctor, Long> {
	
	Doctor findByUserName(String name);
	Doctor findByNumber(String number);
	Doctor findByEmailId(String number);



}
