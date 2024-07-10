package com.karthikgolfer.healthcarememinfo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/subscriberbenefitdetails")
public class SubscriberBenefitDetailsController {

	 @Autowired
	    private SubscriberBenefitDetailsService subscriberbenefitdetailsService;
		     
	    @GetMapping("/")
	    public List<SubscriberBenefitDetails> Subcriber_Benefit_Details(){
	        return subscriberbenefitdetailsService.Subcriber_Benefit_Details();
	    }

	
}
