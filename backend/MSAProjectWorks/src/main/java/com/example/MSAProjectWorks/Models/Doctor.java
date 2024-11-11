package com.example.MSAProjectWorks.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "doctors")
public class Doctor {
    @Id
    private String id;
    private String userId; // Reference to the User ID
    private String specialization;
    private String availableHours;
    private String licenseNumber;

    // Default Constructor
    public Doctor() {}

    // Parameterized Constructor
    public Doctor(String userId, String specialization, String availableHours, String licenseNumber) {
        this.userId = userId;
        this.specialization = specialization;
        this.availableHours = availableHours;
        this.licenseNumber = licenseNumber;
    }

    // Getters and Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getAvailableHours() {
        return availableHours;
    }

    public void setAvailableHours(String availableHours) {
        this.availableHours = availableHours;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }
}
