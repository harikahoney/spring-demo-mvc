package com.luv2code.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.luv2code.springdemo.mvc.validation.CouseCode;

public class Customer {
	
	
	private String firstName;
	
	@NotNull(message="is required")
	@Min(value=0,message="value should be equal to 0 or above")
	@Max(value=10,message="value should be equal to 10 or lessthan 0")
	private Integer races;//if this value is compulsory then we have to use notnull so we have to use primitive data type thatswhy i c int to Integerhange
	
	
	@Pattern(regexp="^[a-zA-Z0-9] {5}",message="only 5 chars/digits")
	private String postalCode;
	
	@NotNull(message="is required")//custom msg
	@Size(min=1,message="is required")
	private String lastName;
	@CouseCode(value="TOPS",message="must start with TOPS")
	private String courseCode;
	
	
	public String getPostalCode() {
		return postalCode;
	}


	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}


	public String getFirstName() {
		return firstName;
		
	}
    
	
	public Integer getRaces() {
		return races;
	}


	public void setRaces(Integer races) {
		this.races = races;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getCourseCode() {
		return courseCode;
	}


	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	

}
