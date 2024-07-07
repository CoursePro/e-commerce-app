package com.lp.ecom.notificationservice.notification;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author: Lucky Prabath
 * @since: 2024-07-06
 */
public interface NotificationRepository extends MongoRepository<Notification, String> {
}
