package com.lp.ecom.orderservice.order;

import org.springframework.stereotype.Service;

/**
 * @author: Lucky Prabath
 * @since: 2024-07-05
 */
@Service
public class OrderMapper {

    public Order toOrder(OrderRequest request) {
        return Order.builder()
                .id(request.id())
                .customerId(request.customerId())
                .reference(request.reference())
                .totalAmount(request.amount())
                .paymentMethod(request.paymentMethod())
                .build();
    }
}
