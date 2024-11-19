package com.example.MSAProjectWorks.Repositories;

import com.example.MSAProjectWorks.Models.Appointment;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface AppointmentRepository extends MongoRepository<Appointment, String>{
}
