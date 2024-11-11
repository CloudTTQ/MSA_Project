package com.example.MSAProjectWorks.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "notifications")
public class Notification {
    @Id
    private String id;
    private String userId;
    private String message;
    private Date notificationDate;
    private boolean readStatus;

    public Notification() {}

    public Notification(String userId, String message, Date notificationDate, boolean readStatus) {
        this.userId = userId;
        this.message = message;
        this.notificationDate = notificationDate;
        this.readStatus = readStatus;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public Date getNotificationDate() { return notificationDate; }
    public void setNotificationDate(Date notificationDate) { this.notificationDate = notificationDate; }

    public boolean isReadStatus() { return readStatus; }
    public void setReadStatus(boolean readStatus) { this.readStatus = readStatus; }

    public void markAsRead() { this.readStatus = true; }
    public void markAsUnread() { this.readStatus = false; }
}
