package com.lp.ecom.paymentservice.payment;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: Lucky Prabath
 * @since: 2024-07-06
 */
public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
