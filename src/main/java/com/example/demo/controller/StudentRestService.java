package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/panna")
public class StudentRestService {
	
	 private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("/bombay")
   List<Student> getStudentNames()
   {

		 logger.info("I am inside the method DUDE...");
		 List<Student> lst=new ArrayList<Student>();
		 Student s1=new Student();
		 Student s2=new Student();
		 Student s3=new Student();
		 
		 s1.setFirstName("Ashok");
		 s1.setLastName("Kumar");
		 s1.setAddress("123 Parker Lane");
		 s1.setCity("Fremont");
		 s1.setState("CA");
		 s1.setZip("94555");
		 
		 s1.setFirstName("Rajat");
		 s2.setLastName("Verma");
		 s2.setAddress("897 Edgewater Drive");
		 s2.setCity("Newark");
		 s2.setState("CA");
		 s2.setZip("94560");
		 
		 s3.setFirstName("Pavan");
		 s3.setLastName("Shukla");
		 s3.setAddress("786 Lowell Drive");
		 s3.setCity("Pleasanton	");
		 s3.setState("CA");
		 s3.setZip("94533");
		 
		 lst.add(s1);
		 lst.add(s2);
		 lst.add(s3);
		 
		 return lst;
		
   }
}
