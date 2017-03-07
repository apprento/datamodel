package com.raja.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.raja.events.DoctorEvent;
import com.raja.model.Doctor;
import com.raja.repository.DoctorRepository;

public interface DoctorService {
	
	
	Doctor findDocByFilters(DoctorEvent event);
	
	@Service
	class Impl implements DoctorService{
		
		@Autowired
		private DoctorRepository doctorRepo;

		@Override
		public Doctor findDocByFilters(DoctorEvent event) {
			Doctor doctor=null;
			
			if(!StringUtils.isEmpty(event.getUserName()))
				doctor= doctorRepo.findByUserName(event.getUserName());
			
			
			if(!StringUtils.isEmpty(event.getNumber()))
				doctor= doctorRepo.findByNumber(event.getNumber());
			
			
			if(!StringUtils.isEmpty(event.getMailId()))
				doctor= doctorRepo.findByEmailId(event.getMailId());
			
			return doctor;
		}
		
		
		
	}

}
