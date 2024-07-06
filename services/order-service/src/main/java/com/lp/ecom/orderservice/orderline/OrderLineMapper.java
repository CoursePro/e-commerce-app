package com.lp.ecom.orderservice.orderline;

import com.lp.ecom.orderservice.order.Order;
import org.springframework.stereotype.Service;

/**
 * @author: Lucky Prabath
 * @since: 2024-07-06
 */
@Service
public class OrderLineMapper {
    public OrderLine toOrderLine(OrderLineRequest request) {
        return OrderLine.builder()
                .id(request.id())
                .quantity(request.quantity())
                .order(
                        Order.builder()
                                .id(request.orderId())
                                .build()
                )
                .productId(request.productId())
                .build();
    }

    public OrderLineResponse toOrderLineResponse(OrderLine orderLine) {
         return new OrderLineResponse(
                 orderLine.getId(),
                 orderLine.getQuantity()
         );
    }
}
