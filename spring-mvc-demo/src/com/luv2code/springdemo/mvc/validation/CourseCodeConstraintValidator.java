package com.luv2code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CouseCode,String> {

	private String prefix;
	
	@Override
	public void initialize(CouseCode theCouseCode)
	{
		prefix=theCouseCode.value();
	}
	
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
		// TODO Auto-generated method stub
		boolean result;
		if(theCode != null)
		{
			
		result = theCode.startsWith(prefix);
		}
		else
		{
			result=true;
		}
		
		return result;
	}

}
