package com.lp.ecom.productservice.category;

import com.lp.ecom.productservice.product.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author: Lucky Prabath
 * @since: 2024-06-30
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Category {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String description;

    @OneToMany( mappedBy = "category", cascade = CascadeType.REMOVE)
    private List<Product> products;
}
