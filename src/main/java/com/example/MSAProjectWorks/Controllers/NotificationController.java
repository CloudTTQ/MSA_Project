package com.example.MSAProjectWorks.Controllers;

import com.example.MSAProjectWorks.Models.Notification;
import com.example.MSAProjectWorks.Services.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @PostMapping
    public ResponseEntity<Notification> createNotification(@RequestBody Notification notification) {
        Notification createdNotification = notificationService.createNotification(notification);
        return ResponseEntity.ok(createdNotification);
    }

    //@GetMapping("/user/{userId}")
    //public ResponseEntity<List<Notification>> getNotificationsByUserId(@PathVariable String userId) {
       // List<Notification> notifications = notificationService.getNotificationsByUserId(userId);
       // return ResponseEntity.ok(notifications);
    //}

    @PutMapping("/{id}")
    public ResponseEntity<Notification> updateNotification(@PathVariable String id, @RequestBody Notification notificationDetails) {
        Notification updatedNotification = notificationService.updateNotification(id, notificationDetails);
        return ResponseEntity.ok(updatedNotification);
    }

    @PutMapping("/{id}/mark-read")
    public ResponseEntity<Notification> markNotificationAsRead(@PathVariable String id) {
        Notification notification = notificationService.markAsRead(id);
        return ResponseEntity.ok(notification);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteNotification(@PathVariable String id) {
        notificationService.deleteNotification(id);
        return ResponseEntity.noContent().build();
    }
}
