package com.lp.ecom.paymentservice.payment;

import com.lp.ecom.paymentservice.notification.NotificationProducer;
import com.lp.ecom.paymentservice.notification.PaymentNotificationRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author: Lucky Prabath
 * @since: 2024-07-06
 */
@Service
@RequiredArgsConstructor
public class PaymentService {

    private final PaymentRepository repository;

    private final PaymentMapper mapper;

    private final NotificationProducer notificationProducer;

    public Integer createPayment(PaymentRequest request) {
        // add payment
        var payment = repository.save(mapper.toPayment(request));

        // send notification
        notificationProducer.sendNotification(
                new PaymentNotificationRequest(
                        request.orderReference(),
                        request.amount(),
                        request.paymentMethod(),
                        request.customer().firstname(),
                        request.customer().lastname(),
                        request.customer().email()   // customer is not validate here, because this have previous validation in customer class and controller
                )
        );

        return payment.getId();
    }
}
