package com.lp.ecom.orderservice.orderline;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author: Lucky Prabath
 * @since: 2024-07-06
 */
@Service
@RequiredArgsConstructor
public class OrderLineService {

    private final OrderLineRepository repository;

    private final OrderLineMapper mapper;

    public Integer saveOrderLine(OrderLineRequest request) {
        var order = mapper.toOrderLine(request);
        return repository.save(order).getId();
    }
}
