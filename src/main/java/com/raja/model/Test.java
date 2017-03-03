package com.raja.model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Data
@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@SequenceGenerator(name= "test_seq", sequenceName= "test_seq", initialValue=1)
public class Test {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO/*, generator="test_seq"*/)
	@Column(name="id")
	private Long id;
	
	@Column(name="name")
	private String name;

}
