package com.lp.ecom.notificationservice.email;

import lombok.Getter;

/**
 * @author: Lucky Prabath
 * @since: 2024-07-06
 */
public enum EmailTemplates {
    PAYMENT_CONFIRMATION("payment-confirmation.html", "Payment successfully processed"),
    ORDER_CONFIRMATION("order-confirmation.html", "Order confirmation");

    @Getter
    private final String template;

    @Getter
    private final String subject;

    EmailTemplates(String template, String subject) {
        this.template = template;
        this.subject = subject;
    }
}
