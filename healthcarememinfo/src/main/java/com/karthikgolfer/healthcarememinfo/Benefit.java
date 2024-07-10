package com.karthikgolfer.healthcarememinfo;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


@Entity

public class Benefit {
	
	@Id  
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull(message = "Name cannot be null")
    @Size(min = 2, max = 100, message = "Name must be between 2 and 100 characters")
    private String name;
    
    @NotNull(message = "Description cannot be null")
    @Size(min = 10, max = 1000, message = "Description must be between 10 and 1000 characters")
    private String description;
    
    // Getters and setters
 // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

   

}
