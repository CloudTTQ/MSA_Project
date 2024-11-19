package com.example.MSAProjectWorks.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "prescriptions")
public class Prescription {
    @Id
    private String id;
    private String appointmentId;
    private String doctorId;
    private String patientId;
    private Date issueDate;
    private String instructions;

    public Prescription() {}

    public Prescription(String appointmentId, String doctorId, String patientId, Date issueDate, String instructions) {
        this.appointmentId = appointmentId;
        this.doctorId = doctorId;
        this.patientId = patientId;
        this.issueDate = issueDate;
        this.instructions = instructions;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getAppointmentId() { return appointmentId; }
    public void setAppointmentId(String appointmentId) { this.appointmentId = appointmentId; }

    public String getDoctorId() { return doctorId; }
    public void setDoctorId(String doctorId) { this.doctorId = doctorId; }

    public String getPatientId() { return patientId; }
    public void setPatientId(String patientId) { this.patientId = patientId; }

    public Date getIssueDate() { return issueDate; }
    public void setIssueDate(Date issueDate) { this.issueDate = issueDate; }

    public String getInstructions() { return instructions; }
    public void setInstructions(String instructions) { this.instructions = instructions; }

    public String getFullPrescriptionDetails() {
        return "Prescription for Patient ID: " + patientId + ", Issued on: " + issueDate + ", Instructions: " + instructions;
    }
}
