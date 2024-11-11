package com.example.MSAProjectWorks.Services;

import com.example.MSAProjectWorks.Models.Prescription;
import com.example.MSAProjectWorks.Repositories.PrescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PrescriptionService {

    @Autowired
    private PrescriptionRepository prescriptionRepository;

    public Prescription createPrescription(Prescription prescription) {
        return prescriptionRepository.save(prescription);
    }


    public Prescription updatePrescription(String id, Prescription prescriptionDetails) {
        Optional<Prescription> optionalPrescription = prescriptionRepository.findById(id);
        if (optionalPrescription.isPresent()) {
            Prescription prescription = optionalPrescription.get();
            prescription.setAppointmentId(prescriptionDetails.getAppointmentId());
            prescription.setDoctorId(prescriptionDetails.getDoctorId());
            prescription.setPatientId(prescriptionDetails.getPatientId());
            prescription.setIssueDate(prescriptionDetails.getIssueDate());
            prescription.setInstructions(prescriptionDetails.getInstructions());
            return prescriptionRepository.save(prescription);
        } else {
            throw new RuntimeException("Prescription not found with id " + id);
        }
    }

    public String getFullPrescriptionDetails(String id) {
        Optional<Prescription> optionalPrescription = prescriptionRepository.findById(id);
        if (optionalPrescription.isPresent()) {
            return optionalPrescription.get().getFullPrescriptionDetails();
        } else {
            throw new RuntimeException("Prescription not found with id " + id);
        }
    }

    public void deletePrescription(String id) {
        prescriptionRepository.deleteById(id);
    }
}
