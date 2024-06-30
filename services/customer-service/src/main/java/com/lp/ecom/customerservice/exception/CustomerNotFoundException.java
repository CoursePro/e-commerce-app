package com.lp.ecom.customerservice.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author: Lucky Prabath
 * @since: 2024-06-29
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerNotFoundException extends RuntimeException {

    private final String msg;
}
