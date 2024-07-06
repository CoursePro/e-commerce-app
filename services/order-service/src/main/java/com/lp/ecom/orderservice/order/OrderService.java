package com.lp.ecom.orderservice.order;

import com.lp.ecom.orderservice.customer.CustomerClient;
import com.lp.ecom.orderservice.exception.BusinessException;
import com.lp.ecom.orderservice.orderline.OrderLineRequest;
import com.lp.ecom.orderservice.orderline.OrderLineService;
import com.lp.ecom.orderservice.product.ProductClient;
import com.lp.ecom.orderservice.product.PurchaseRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author: Lucky Prabath
 * @since: 2024-07-03
 */
@Service
@RequiredArgsConstructor
public class OrderService {

    private final CustomerClient customerClient;

    private final ProductClient productClient;

    private final OrderRepository repository;

    private final OrderMapper mapper;

    private final OrderLineService orderLineService;

    public Integer createOrder(OrderRequest request) {
        // check the customer -->
        var customer = this.customerClient.findCustomerById(request.customerId())
                .orElseThrow(() -> new BusinessException("Cannot create order:: No customer exist with the provided ID"));

        // purchase the product --> product-service ms (RestTemplate)
        this.productClient.purchaseProducts(request.products());

        // persist order
        var order = this.repository.save(mapper.toOrder(request));

        // persist order lines
        for (PurchaseRequest purchaseRequest: request.products()) {
            orderLineService.saveOrderLine(
                    new OrderLineRequest(
                            null,
                            order.getId(),
                            purchaseRequest.productId(),
                            purchaseRequest.quantity()
                    )
            );
        }

        // start payment process todo

        // send the order confirmation --> notification-service ms (kafka)
        return null;
    }
}
