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

    public Medication createMedication(Medication medication) {
        return medicationRepository.save(medication);
    }

    public Medication updateMedication(String id, Medication medicationDetails) {
        Optional<Medication> optionalMedication = medicationRepository.findById(id);
        if (optionalMedication.isPresent()) {
            Medication medication = optionalMedication.get();
            medication.setMedicationName(medicationDetails.getMedicationName());
            medication.setDosage(medicationDetails.getDosage());
            medication.setFrequency(medicationDetails.getFrequency());
            medication.setDuration(medicationDetails.getDuration());
            return medicationRepository.save(medication);
        } else {
            throw new RuntimeException("Medication not found with id " + id);
        }
    }

    public String getFullMedicationDetails(String id) {
        Optional<Medication> optionalMedication = medicationRepository.findById(id);
        if (optionalMedication.isPresent()) {
            return optionalMedication.get().getFullMedicationDetails();
        } else {
            throw new RuntimeException("Medication not found with id " + id);
        }
    }

    public void deleteMedication(String id) {
        medicationRepository.deleteById(id);
    }
}
