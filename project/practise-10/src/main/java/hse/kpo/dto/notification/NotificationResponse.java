package hse.kpo.dto.notification;

import lombok.Data;

@Data
public class NotificationResponse {
    private String id;
    private boolean success;
    private String message;
}