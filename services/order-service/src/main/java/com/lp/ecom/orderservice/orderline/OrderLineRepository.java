package com.lp.ecom.orderservice.orderline;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author: Lucky Prabath
 * @since: 2024-07-06
 */
public interface OrderLineRepository extends JpaRepository<OrderLine, Integer> {
    List<OrderLine> findAllByOrderId(Integer orderId);
}
