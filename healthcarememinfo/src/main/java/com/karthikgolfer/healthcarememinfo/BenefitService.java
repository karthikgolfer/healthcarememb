package com.karthikgolfer.healthcarememinfo;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BenefitService {
    @Autowired
    private BenefitRepository benefitRepository;

    public List<Benefit> getBenefitsById(int Id) {
        return benefitRepository.findById(Id);
    }
    
    public Benefit createBenefit(Benefit benefit) {
        return benefitRepository.save(benefit);
    }

    public Benefit updateBenefit(Long id, Benefit benefitDetails) {
        Optional<Benefit> benefitOptional = benefitRepository.findById(id);
        if (benefitOptional.isPresent()) {
            Benefit benefit = benefitOptional.get();
            benefit.setName(benefitDetails.getName());
            benefit.setDescription(benefitDetails.getDescription());
            
            return benefitRepository.save(benefit);
        } else {
            throw new RuntimeException("Benefit not found with id " + id);
        }
    }

    public void deleteBenefit(Long id) {
        benefitRepository.deleteById(id);
    }
}
