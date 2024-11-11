package com.example.MSAProjectWorks.Controllers;

import com.example.MSAProjectWorks.Models.Medication;
import com.example.MSAProjectWorks.Services.MedicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/medications")
public class MedicationController {

    @Autowired
    private MedicationService medicationService;

    @PostMapping
    public ResponseEntity<Medication> createMedication(@RequestBody Medication medication) {
        Medication createdMedication = medicationService.createMedication(medication);
        return ResponseEntity.ok(createdMedication);
    }

    @GetMapping("/prescription/{prescriptionId}")
    //public ResponseEntity<List<Medication>> getMedicationsByPrescriptionId(@PathVariable String prescriptionId) {
        //List<Medication> medications = medicationService.getMedicationsByPrescriptionId(prescriptionId);
      //  return ResponseEntity.ok(medications);
    //}

    @PutMapping("/{id}")
    public ResponseEntity<Medication> updateMedication(@PathVariable String id, @RequestBody Medication medicationDetails) {
        Medication updatedMedication = medicationService.updateMedication(id, medicationDetails);
        return ResponseEntity.ok(updatedMedication);
    }

    @GetMapping("/{id}/details")
    public ResponseEntity<String> getFullMedicationDetails(@PathVariable String id) {
        String details = medicationService.getFullMedicationDetails(id);
        return ResponseEntity.ok(details);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMedication(@PathVariable String id) {
        medicationService.deleteMedication(id);
        return ResponseEntity.noContent().build();
    }
}
