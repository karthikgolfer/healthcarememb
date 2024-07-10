package com.karthikgolfer.healthcarememinfo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "subscriber_benefit")
public class SubscriberBenefit {

    @Id  
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "subscriber_id")
    private int subscriber_id;

    @NotNull(message = "Subscriber Name cannot be null")
    @Size(min = 2, max = 100, message = "Name must be between 2 and 100 characters")
    private String subscribername;

    @NotNull(message = "Benefit_id cannot be null")
    private int benefit_id;

    private Double copay;

    private Float coin ;

    @NotNull(message = "Zipcode cannot be null")
    @Size(min = 1, max = 5, message = "Zipcode must be between 1 and 5")
    private String zipcode;  // Ensure this matches

    // Getters and setters

 
    public String getSubscribername() {
        return subscribername;
    }

    public void setSubscribername(String subscribername) {
        this.subscribername = subscribername;
    }

    public int getBenefit_id() {
        return benefit_id;
    }

    public void setBenefit_id(int benefit_id) {
        this.benefit_id = benefit_id;
    }

    public Double getCopay() {
        return copay;
    }

    public void setCopay(Double copay) {
        this.copay = copay;
    }

   // get { return _addtionalData ?? "NULL"; }
    public Float getCoin() {
    	        return coin;
    }

    public void setCoin(Float coin) {
        this.coin = coin;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
