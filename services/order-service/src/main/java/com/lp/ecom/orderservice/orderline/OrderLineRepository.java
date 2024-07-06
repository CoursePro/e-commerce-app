package com.lp.ecom.orderservice.orderline;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: Lucky Prabath
 * @since: 2024-07-06
 */
public interface OrderLineRepository extends JpaRepository<OrderLine, Integer> {
}
