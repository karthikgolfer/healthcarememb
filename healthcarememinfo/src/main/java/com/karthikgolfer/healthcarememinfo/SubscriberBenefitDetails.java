package com.karthikgolfer.healthcarememinfo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class SubscriberBenefitDetails {

	//s.subscribername,b.name,b.[description],s.copay,s.coin,s.Zipcode
	
	 	@Id  
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long subscriber_id;  // Ensure this is your primary key field
	    private String subscribername;	    
	    private String benefitname; 
	    private String benefitdescription;
	    private Double copay;
	    private Float coin ;	    
	    private String subscriberzipcode;
		public String getSubscribername() {
			return subscribername;
		}
		public void setSubscribername(String subscribername) {
			this.subscribername = subscribername;
		}
		public String getBenefitname() {
			return benefitname;
		}
		public void setBenefitname(String benefitname) {
			this.benefitname = benefitname;
		}
		public String getBenefitdescription() {
			return benefitdescription;
		}
		public void setBenefitdescription(String benefitdescription) {
			this.benefitdescription = benefitdescription;
		}
		public String getSubscriberzipcode() {
			return subscriberzipcode;
		}
		public void setSubscriberzipcode(String subscriberzipcode) {
			this.subscriberzipcode = subscriberzipcode;
		}
		public Double getCopay() {
			return copay;
		}
		public void setCopay(Double copay) {
			this.copay = copay;
		}
		public Float getCoin() {
			return coin;
		}
		public void setCoin(Float coin) {
			this.coin = coin;
		}

	  
	    
	
}
