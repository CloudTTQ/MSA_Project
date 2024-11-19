package com.example.MSAProjectWorks.Services;

import com.example.MSAProjectWorks.Models.Medication;
import com.example.MSAProjectWorks.Repositories.MedicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicationService {

    @Autowired
    private MedicationRepository medicationRepository;

    // Create new medication and assign it to a patient
    public Medication createMedication(Medication medication) {
        return medicationRepository.save(medication);
    }

    // Update existing medication details by ID
    public Medication updateMedication(String id, Medication medicationDetails) {
        Optional<Medication> optionalMedication = medicationRepository.findById(id);
        if (optionalMedication.isPresent()) {
            Medication medication = optionalMedication.get();
            medication.setMedicationName(medicationDetails.getMedicationName());
            medication.setAssignedTo(medicationDetails.getAssignedTo());  // Ensure patient is linked via ID
            medication.setPrescriptionId(medicationDetails.getPrescriptionId());
            medication.setFrequency(medicationDetails.getFrequency());
            medication.setDosage(medicationDetails.getDosage());
            medication.setTakenToday(medicationDetails.getTakenToday());
            return medicationRepository.save(medication);
        } else {
            throw new RuntimeException("Medication not found with id " + id);
        }
    }

    // Get full medication details by ID
    public String getFullMedicationDetails(String id) {
        Optional<Medication> optionalMedication = medicationRepository.findById(id);
        if (optionalMedication.isPresent()) {
            return optionalMedication.get().getFullMedicationDetails();
        } else {
            throw new RuntimeException("Medication not found with id " + id);
        }
    }

    // Delete medication by ID
    public void deleteMedication(String id) {
        medicationRepository.deleteById(id);
    }
}
