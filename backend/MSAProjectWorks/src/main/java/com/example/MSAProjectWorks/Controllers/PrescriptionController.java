package com.example.MSAProjectWorks.Controllers;

import com.example.MSAProjectWorks.Models.Prescription;
import com.example.MSAProjectWorks.Services.PrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/prescriptions")
public class PrescriptionController {

    @Autowired
    private PrescriptionService prescriptionService;

    @PostMapping
    public ResponseEntity<Prescription> createPrescription(@RequestBody Prescription prescription) {
        Prescription createdPrescription = prescriptionService.createPrescription(prescription);
        return ResponseEntity.ok(createdPrescription);
    }

    //@GetMapping("/patient/{patientId}")
    //public ResponseEntity<List<Prescription>> getPrescriptionsByPatientId(@PathVariable String patientId) {
        //List<Prescription> prescriptions = prescriptionService.getPrescriptionsByPatientId(patientId);
     //   return ResponseEntity.ok(prescriptions);
    //}

    @PutMapping("/{id}")
    public ResponseEntity<Prescription> updatePrescription(@PathVariable String id, @RequestBody Prescription prescriptionDetails) {
        Prescription updatedPrescription = prescriptionService.updatePrescription(id, prescriptionDetails);
        return ResponseEntity.ok(updatedPrescription);
    }

    @GetMapping("/{id}/details")
    public ResponseEntity<String> getFullPrescriptionDetails(@PathVariable String id) {
        String details = prescriptionService.getFullPrescriptionDetails(id);
        return ResponseEntity.ok(details);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePrescription(@PathVariable String id) {
        prescriptionService.deletePrescription(id);
        return ResponseEntity.noContent().build();
    }
}
