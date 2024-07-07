package com.lp.ecom.orderservice.payment;

import com.lp.ecom.orderservice.customer.CustomerResponse;
import com.lp.ecom.orderservice.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {
}
