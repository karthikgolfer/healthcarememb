package com.karthikgolfer.healthcarememinfo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

public interface SubscriberBenefitDetailsRepository extends JpaRepository<SubscriberBenefitDetails, Long>{
	
	
	 @Procedure(name = "Subcriber_Benefit_Details")
	    List<SubscriberBenefitDetails> Subcriber_Benefit_Details();
	}

