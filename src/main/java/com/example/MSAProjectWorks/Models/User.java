package com.example.MSAProjectWorks.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "users")
public class User {
    @Id
    private String id;
    private String fullName;
    private String email;
    private String phone;
    private String address;
    private Date createdAt;
    private String userType; // "doctor" or "patient"

    // Doctor-specific fields (optional if the userType is "patient")
    private String specialization;
    private String availableHours;
    private String licenseNumber;

    // Patient-specific fields (optional if the userType is "doctor")
    private Integer age;
    private String healthConditions;

    public User() {}

    // Constructor for common fields
    public User(String fullName, String email, String phone, String address, Date createdAt, String userType) {
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.createdAt = createdAt;
        this.userType = userType;
    }

    // Constructor for Doctor
    public User(String fullName, String email, String phone, String address, Date createdAt, String userType,
                String specialization, String availableHours, String licenseNumber) {
        this(fullName, email, phone, address, createdAt, userType);
        this.specialization = specialization;
        this.availableHours = availableHours;
        this.licenseNumber = licenseNumber;
    }

    // Constructor for Patient
    public User(String fullName, String email, String phone, String address, Date createdAt, String userType,
                Integer age, String healthConditions) {
        this(fullName, email, phone, address, createdAt, userType);
        this.age = age;
        this.healthConditions = healthConditions;
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public Date getCreatedAt() { return createdAt; }
    public void setCreatedAt(Date createdAt) { this.createdAt = createdAt; }

    public String getUserType() { return userType; }
    public void setUserType(String userType) { this.userType = userType; }

    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }

    public String getAvailableHours() { return availableHours; }
    public void setAvailableHours(String availableHours) { this.availableHours = availableHours; }

    public String getLicenseNumber() { return licenseNumber; }
    public void setLicenseNumber(String licenseNumber) { this.licenseNumber = licenseNumber; }

    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }

    public String getHealthConditions() { return healthConditions; }
    public void setHealthConditions(String healthConditions) { this.healthConditions = healthConditions; }
}
