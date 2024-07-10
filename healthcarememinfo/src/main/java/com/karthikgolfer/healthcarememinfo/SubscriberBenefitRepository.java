package com.karthikgolfer.healthcarememinfo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface SubscriberBenefitRepository extends JpaRepository<SubscriberBenefit, Long> {
    List<SubscriberBenefit> findByZipcode(String Zipcode);
    
    List<SubscriberBenefit> findBySubscribername(String SubsrciberName);
    
       
    
}
