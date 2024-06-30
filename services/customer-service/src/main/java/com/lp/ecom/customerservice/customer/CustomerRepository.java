package com.lp.ecom.customerservice.customer;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author: Lucky Prabath
 * @since: 2024-06-29
 */
public interface CustomerRepository extends MongoRepository<Customer, String> {
}
