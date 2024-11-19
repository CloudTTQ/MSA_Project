package com.example.MSAProjectWorks.Repositories;

import com.example.MSAProjectWorks.Models.Notification;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface NotificationRepository extends MongoRepository<Notification, String>{
}
