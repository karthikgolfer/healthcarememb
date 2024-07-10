package com.karthikgolfer.healthcarememinfo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.*;

@Service
public class SubscriberBenefitDetailsService {
	
	 @Autowired
	    private SubscriberBenefitDetailsRepository subscriberbenefitdetailsRepository;
	 @Transactional(readOnly = true)
	    public List<SubscriberBenefitDetails> Subcriber_Benefit_Details(){
	        return subscriberbenefitdetailsRepository.Subcriber_Benefit_Details();
	    }

}
