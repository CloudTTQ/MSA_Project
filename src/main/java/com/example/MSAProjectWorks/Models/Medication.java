package com.example.MSAProjectWorks.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "medications")
public class Medication {

    @Id
    private String id;
    private String medicationName;
    private String assignedTo;  // Link to Patient by their ID (patient ID)
    private Integer prescriptionId;
    private Integer frequency;
    private Integer dosage;
    private Boolean takenToday;

    // Default constructor
    public Medication() {}

    // Parameterized constructor to create new medication
    public Medication(String medicationName, String assignedTo, Integer prescriptionId, Integer frequency, Integer dosage, Boolean takenToday) {
        this.medicationName = medicationName;
        this.assignedTo = assignedTo;
        this.prescriptionId = prescriptionId;
        this.frequency = frequency;
        this.dosage = dosage;
        this.takenToday = takenToday;
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getMedicationName() { return medicationName; }
    public void setMedicationName(String medicationName) { this.medicationName = medicationName; }

    public String getAssignedTo() { return assignedTo; }
    public void setAssignedTo(String assignedTo) { this.assignedTo = assignedTo; }

    public Integer getPrescriptionId() { return prescriptionId; }
    public void setPrescriptionId(Integer prescriptionId) { this.prescriptionId = prescriptionId; }

    public Integer getFrequency() { return frequency; }
    public void setFrequency(Integer frequency) { this.frequency = frequency; }

    public Integer getDosage() { return dosage; }
    public void setDosage(Integer dosage) { this.dosage = dosage; }

    public Boolean getTakenToday() { return takenToday; }
    public void setTakenToday(Boolean takenToday) { this.takenToday = takenToday; }

    // Method to get full medication details in a readable format
    public String getFullMedicationDetails() {
        return "Medication: " + medicationName + ", Assigned to Patient ID: " + assignedTo +
                ", Prescription ID: " + prescriptionId + ", Frequency: " + frequency +
                ", Dosage: " + dosage + ", Taken Today: " + takenToday;
    }
}
