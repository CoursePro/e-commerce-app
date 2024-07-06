package com.lp.ecom.orderservice.kafka;

import com.lp.ecom.orderservice.customer.CustomerResponse;
import com.lp.ecom.orderservice.order.PaymentMethod;
import com.lp.ecom.orderservice.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation(
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products
) {
}
