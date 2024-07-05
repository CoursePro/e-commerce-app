package com.lp.ecom.orderservice.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author: Lucky Prabath
 * @since: 2024-07-04
 */

@EqualsAndHashCode(callSuper = true)
@Data
public class BusinessException extends RuntimeException {

    private final String msg;
}
