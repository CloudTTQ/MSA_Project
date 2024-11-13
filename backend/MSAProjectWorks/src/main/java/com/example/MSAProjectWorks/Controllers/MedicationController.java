package com.example.MSAProjectWorks.Controllers;

import com.example.MSAProjectWorks.Models.Medication;
import com.example.MSAProjectWorks.Services.MedicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/medications")
public class MedicationController {

    @Autowired
    private MedicationService medicationService;

    // Endpoint to create new medication
    @PostMapping
    public ResponseEntity<Medication> createMedication(@RequestBody Medication medication) {
        Medication createdMedication = medicationService.createMedication(medication);
        return ResponseEntity.ok(createdMedication);
    }

    // Endpoint to update existing medication details
    @PutMapping("/{id}")
    public ResponseEntity<Medication> updateMedication(@PathVariable String id, @RequestBody Medication medicationDetails) {
        Medication updatedMedication = medicationService.updateMedication(id, medicationDetails);
        return ResponseEntity.ok(updatedMedication);
    }

    // Endpoint to get full medication details by ID
    @GetMapping("/{id}/details")
    public ResponseEntity<String> getFullMedicationDetails(@PathVariable String id) {
        String details = medicationService.getFullMedicationDetails(id);
        return ResponseEntity.ok(details);
    }

    // Endpoint to delete medication by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMedication(@PathVariable String id) {
        medicationService.deleteMedication(id);
        return ResponseEntity.noContent().build();
    }
}
