package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class studentController {
    @RequestMapping("/showForm")
	public String showForm(Model theModel)
	{
    	//create a student object
    	Student theStudent = new Student();
    	
    	//add student object to model
    	theModel.addAttribute("student", theStudent);
    	
    	
		return "student-Form";
	}
    @RequestMapping("/processForm")
    public String proceesForm(@ModelAttribute("student") Student theStudent)
   //log in to input data
    {
    	System.out.println("theStudent:" + theStudent.getFirstName() +  " " + theStudent.getLastName() + " " + theStudent.getCountry());
		return "student-confirmation";
    	
    }
    
    
    
}
