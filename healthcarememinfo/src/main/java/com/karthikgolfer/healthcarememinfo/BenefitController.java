package com.karthikgolfer.healthcarememinfo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/benefits")
public class BenefitController {
    @Autowired
    private BenefitService benefitService;
    private SqlService sqlService;

    @GetMapping("/hello")  
    public String hello() {   
     return "Hello, world I love golf"; 
     }
    
    @GetMapping("/benefit/{Id}")
    public List<Benefit> getBenefitsById(@PathVariable int Id) {
        return benefitService.getBenefitsById(Id);
    }

    @PostMapping("/")
    public ResponseEntity<Benefit> createBenefit(@Valid @RequestBody Benefit benefit) {
        Benefit createdBenefit = benefitService.createBenefit(benefit);
        return new ResponseEntity<>(createdBenefit, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Benefit> updateBenefit(@PathVariable Long id, @Valid @RequestBody Benefit benefitDetails) {
        Benefit updatedBenefit = benefitService.updateBenefit(id, benefitDetails);
        return new ResponseEntity<>(updatedBenefit, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBenefit(@PathVariable Long id) {
        benefitService.deleteBenefit(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
    @GetMapping("/sql")
    public List<Map<String, Object>> getallbenefits() {
    	try {
        return sqlService.getallbenefits();
    } catch (Exception e) {
        throw new ResourceNotFoundException("Error executing query: " + e.getMessage());
    }
    }
    //api/benefits/execute
    @GetMapping("/execute")
    public List<Map<String, Object>> executeQuery(@RequestParam String query) {
              
       try {
           return sqlService.executeQuery(query);
       } catch (Exception e) {
           throw new ResourceNotFoundException("Resource not found for query: " + query);
       }
       
    }
}
