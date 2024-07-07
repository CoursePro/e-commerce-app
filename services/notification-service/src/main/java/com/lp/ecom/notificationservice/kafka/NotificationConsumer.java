package com.lp.ecom.notificationservice.kafka;

import com.lp.ecom.notificationservice.email.EmailService;
import com.lp.ecom.notificationservice.kafka.order.OrderConfirmation;
import com.lp.ecom.notificationservice.kafka.payment.PaymentConfirmation;
import com.lp.ecom.notificationservice.notification.Notification;
import com.lp.ecom.notificationservice.notification.NotificationRepository;
import jakarta.mail.MessagingException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

import static com.lp.ecom.notificationservice.notification.NotificationType.ORDER_CONFIRMATION;
import static com.lp.ecom.notificationservice.notification.NotificationType.PAYMENT_CONFIRMATION;

/**
 * @author: Lucky Prabath
 * @since: 2024-07-06
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class NotificationConsumer {

    private final NotificationRepository repository;

    private final EmailService emailService;

    @KafkaListener(topics = "payment-topic")
    public void consumePaymentSuccessNotification(PaymentConfirmation paymentConfirmation) throws MessagingException {

        log.info(String.format("Consuming the message from payment-topic Topic:: %s", paymentConfirmation));

        // save notification
        repository.save(
                Notification.builder()
                        .type(PAYMENT_CONFIRMATION)
                        .notificationDate(LocalDateTime.now())
                        .paymentConfirmation(paymentConfirmation)
                        .build()
        );

        // send email
        var customerName = paymentConfirmation.customerFirstname() + " " + paymentConfirmation.customerLastname();
        emailService.sendPaymentSuccessEmail(
                paymentConfirmation.customerEmail(),
                customerName,
                paymentConfirmation.amount(),
                paymentConfirmation.orderReference()
        );
    }

    @KafkaListener(topics = "order-topic")
    public void consumeOrderConfirmationNotification(OrderConfirmation orderConfirmation) throws MessagingException {

        log.info(String.format("Consuming the message from order-topic Topic:: %s", orderConfirmation));

        // save notification
        repository.save(
                Notification.builder()
                        .type(ORDER_CONFIRMATION )
                        .notificationDate(LocalDateTime.now())
                        .orderConfirmation(orderConfirmation)
                        .build()
        );

        // send email
        var customerName = orderConfirmation.customer().firstname() + " " + orderConfirmation.customer().lastname();
        emailService.sendOrderConfirmationEmail(
                orderConfirmation.customer().email(),
                customerName,
                orderConfirmation.totalAmount(),
                orderConfirmation.orderReference(),
                orderConfirmation.products()
        );
    }

}
