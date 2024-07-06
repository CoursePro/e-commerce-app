package com.lp.ecom.orderservice.handler;

import java.util.Map;

/**
 * @author: Lucky Prabath
 * @since: 2024-06-30
 */
public record ErrorResponse(
        Map<String, String> errors
) {
}
