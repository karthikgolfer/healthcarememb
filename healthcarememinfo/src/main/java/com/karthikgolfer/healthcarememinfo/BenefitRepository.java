package com.karthikgolfer.healthcarememinfo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BenefitRepository extends JpaRepository<Benefit, Long> {
    List<Benefit> findById(int id);
    
}
