package com.lp.ecom.customerservice.customer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author: Lucky Prabath
 * @since: 2024-06-29
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document
public class Customer {

    private String id;
    private String firstname;
    private String lastname;
    private String email;
    private Address address;
}
