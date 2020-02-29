package com.luv2code.springdemo.mvc.validation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.RetentionPolicy;
@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target( {ElementType.METHOD,ElementType.FIELD} )
@Retention(RetentionPolicy.RUNTIME)

public @interface CouseCode {
	
	//define defult course code
	public String value() default "LUV";
	//define defult error message
	public String message() default "MUST START WITH LUV";
	//define default groups
	public Class<?>[] groups() default {};
	//define default payloads
   public Class<? extends Payload>[] payload() default {};
}
