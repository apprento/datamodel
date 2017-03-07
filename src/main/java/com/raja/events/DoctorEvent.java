package com.raja.events;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class DoctorEvent {
	
	private String userName;
	private String number;
	private String mailId;
	

}
