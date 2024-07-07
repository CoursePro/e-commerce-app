package com.lp.ecom.notificationservice.notification;

import com.lp.ecom.notificationservice.kafka.order.OrderConfirmation;
import com.lp.ecom.notificationservice.kafka.payment.PaymentConfirmation;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

/**
 * @author: Lucky Prabath
 * @since: 2024-07-06
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document
public class Notification {

    @Id
    private String id;

    private NotificationType type;

    private LocalDateTime notificationDate;

    private OrderConfirmation orderConfirmation;

    private PaymentConfirmation paymentConfirmation;
}
