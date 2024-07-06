package com.lp.ecom.orderservice.orderline;

import com.lp.ecom.orderservice.order.Order;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Lucky Prabath
 * @since: 2024-07-03
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class OrderLine {

    @Id
    @GeneratedValue
    private Integer id;

    private double quantity;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    private Integer productId;
}
