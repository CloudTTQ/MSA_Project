package com.example.MSAProjectWorks.Repositories;

import com.example.MSAProjectWorks.Models.Prescription;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface PrescriptionRepository extends MongoRepository<Prescription, String>{
}
