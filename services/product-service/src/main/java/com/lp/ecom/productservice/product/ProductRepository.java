package com.lp.ecom.productservice.product;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author: Lucky Prabath
 * @since: 2024-06-30
 */
public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findAllByIdInOrderById(List<Integer> productIds);
}
