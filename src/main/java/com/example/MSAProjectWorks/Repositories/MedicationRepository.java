package com.example.MSAProjectWorks.Repositories;

import com.example.MSAProjectWorks.Models.Medication;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface MedicationRepository extends MongoRepository<Medication, String>{
}
