package com.raja.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Location {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id", unique=true)
	private Long id;
	
	@Column
	private String country;
	
	@Column
	private String state;
	
	@Column
	private String pinCode;
	
	@Column
	private String address;
	
	@Column
	private String landMark;
	

}
