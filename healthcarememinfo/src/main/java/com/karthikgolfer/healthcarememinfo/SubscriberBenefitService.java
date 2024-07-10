package com.karthikgolfer.healthcarememinfo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubscriberBenefitService {

	@Autowired
    private SubscriberBenefitRepository subscriberbenefitRepository;
		
	
	public List<SubscriberBenefit> findsubsriberByzipcode(String Zipcode){
		return subscriberbenefitRepository.findByZipcode(Zipcode);
	};
    
	public List<SubscriberBenefit> findBySubscribername(String SubsrciberName){
		return subscriberbenefitRepository.findBySubscribername(SubsrciberName);
	};
	
}
