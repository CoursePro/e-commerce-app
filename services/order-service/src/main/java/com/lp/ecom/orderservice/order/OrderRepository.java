package com.lp.ecom.orderservice.order;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: Lucky Prabath
 * @since: 2024-07-05
 */
public interface OrderRepository extends JpaRepository<Order, Integer> {
}
