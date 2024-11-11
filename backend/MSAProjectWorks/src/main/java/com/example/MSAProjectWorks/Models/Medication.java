package com.example.MSAProjectWorks.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "medications")
public class Medication {
    @Id
    private String id;
    private String prescriptionId;
    private String medicationName;
    private String dosage;
    private String frequency;
    private String duration;

    public Medication() {}

    public Medication(String prescriptionId, String medicationName, String dosage, String frequency, String duration) {
        this.prescriptionId = prescriptionId;
        this.medicationName = medicationName;
        this.dosage = dosage;
        this.frequency = frequency;
        this.duration = duration;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getPrescriptionId() { return prescriptionId; }
    public void setPrescriptionId(String prescriptionId) { this.prescriptionId = prescriptionId; }

    public String getMedicationName() { return medicationName; }
    public void setMedicationName(String medicationName) { this.medicationName = medicationName; }

    public String getDosage() { return dosage; }
    public void setDosage(String dosage) { this.dosage = dosage; }

    public String getFrequency() { return frequency; }
    public void setFrequency(String frequency) { this.frequency = frequency; }

    public String getDuration() { return duration; }
    public void setDuration(String duration) { this.duration = duration; }

    public String getFullMedicationDetails() {
        return "Medication: " + medicationName + ", Dosage: " + dosage + ", Frequency: " + frequency + ", Duration: " + duration;
    }
}
