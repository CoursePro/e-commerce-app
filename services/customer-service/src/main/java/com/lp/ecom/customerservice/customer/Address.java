package com.lp.ecom.customerservice.customer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.validation.annotation.Validated;

/**
 * @author: Lucky Prabath
 * @since: 2024-06-29
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Validated
public class Address {

    private String street;
    private String houseNumber;
    private String zipCode;
}
