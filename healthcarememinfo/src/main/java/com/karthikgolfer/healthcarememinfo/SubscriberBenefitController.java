package com.karthikgolfer.healthcarememinfo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/subscriber")
public class SubscriberBenefitController {

	  @Autowired
	    private SubscriberBenefitService subscriberbenefitservice;
	

	    @GetMapping("/hello")  
	    public String hello() {   
	     return "Hello, world karthik love Java Springboot"; 
	     }
	  
	    //   @GetMapping("/benefit/{Id}")
	    @GetMapping("/zipcode/{Zipcode}")
	    public List<SubscriberBenefit> findByzipcode(@PathVariable String Zipcode){
			//return subscriberbenefitservice.findsubsriberByzipcode(Zipcode);
	    	System.out.println("Received request for zipcode: " + Zipcode);
	        List<SubscriberBenefit> benefits = subscriberbenefitservice.findsubsriberByzipcode(Zipcode);
	        System.out.println("Found benefits: " + benefits.size());
	        return benefits;
		};
		
	
	    
		@GetMapping("/name/{SubsrciberName}")
		public List<SubscriberBenefit> findBySubscribername(@PathVariable String SubsrciberName){
			return subscriberbenefitservice.findBySubscribername(SubsrciberName);
		};
		
	    
	
}
