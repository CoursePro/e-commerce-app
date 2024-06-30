package com.lp.ecom.customerservice.customer;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

/**
 * @author: Lucky Prabath
 * @since: 2024-06-30
 */
public record CustomerResponse (
        String id,
        String firstname,

        String lastname,
        String email,
        Address address
){
}
