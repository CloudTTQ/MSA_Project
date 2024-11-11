package com.example.MSAProjectWorks.Services;

import com.example.MSAProjectWorks.Models.Notification;
import com.example.MSAProjectWorks.Repositories.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotificationService {

    @Autowired
    private NotificationRepository notificationRepository;

    public Notification createNotification(Notification notification) {
        return notificationRepository.save(notification);
    }
    public Notification updateNotification(String id, Notification notificationDetails) {
        Optional<Notification> optionalNotification = notificationRepository.findById(id);
        if (optionalNotification.isPresent()) {
            Notification notification = optionalNotification.get();
            notification.setMessage(notificationDetails.getMessage());
            notification.setNotificationDate(notificationDetails.getNotificationDate());
            if (notificationDetails.isReadStatus()) {
                notification.markAsRead();
            } else {
                notification.markAsUnread();
            }
            return notificationRepository.save(notification);
        } else {
            throw new RuntimeException("Notification not found with id " + id);
        }
    }

    public Notification markAsRead(String id) {
        Optional<Notification> optionalNotification = notificationRepository.findById(id);
        if (optionalNotification.isPresent()) {
            Notification notification = optionalNotification.get();
            notification.markAsRead();
            return notificationRepository.save(notification);
        } else {
            throw new RuntimeException("Notification not found with id " + id);
        }
    }

    public void deleteNotification(String id) {
        notificationRepository.deleteById(id);
    }
}
