package com.example.MSAProjectWorks.Repositories;

import com.example.MSAProjectWorks.Models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
