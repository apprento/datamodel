package com.raja.repository;

import org.springframework.stereotype.Repository;

import com.raja.model.Doctor;

@Repository
public interface DoctorRepository extends abstractRepository<Doctor, Long> {

}
