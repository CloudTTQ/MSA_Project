package com.example.MSAProjectWorks.Services;

import com.example.MSAProjectWorks.Models.User;
import com.example.MSAProjectWorks.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(String id) {
        return userRepository.findById(id);
    }

    //public List<User> getUsersByType(String userType) {
    //  return userRepository.findByUserType(userType);
    //}

    public User createUser(User user) {
        // Set the creation date
        user.setCreatedAt(new Date());

        // Validation based on userType
        if ("doctor".equalsIgnoreCase(user.getUserType())) {
            if (user.getSpecialization() == null || user.getLicenseNumber() == null) {
                throw new IllegalArgumentException("Doctor must have specialization and license number.");
            }
        } else if ("patient".equalsIgnoreCase(user.getUserType())) {
            if (user.getAge() == null || user.getHealthConditions() == null) {
                throw new IllegalArgumentException("Patient must have age and health conditions.");
            }
        }

        return userRepository.save(user);
    }

    public User updateUser(String id, User user) {
        if (userRepository.existsById(id)) {
            user.setId(id);
            return userRepository.save(user);
        }
        return null;
    }

    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }
}
