package com.lp.ecom.paymentservice.payment;

import org.springframework.stereotype.Service;

/**
 * @author: Lucky Prabath
 * @since: 2024-07-06
 */
@Service
public class PaymentMapper {
    public Payment toPayment(PaymentRequest request) {
        return Payment.builder()
                .id(request.id())
                .orderId(request.orderId())
                .paymentMethod(request.paymentMethod())
                .amount(request.amount())
                .build();
    }
}
