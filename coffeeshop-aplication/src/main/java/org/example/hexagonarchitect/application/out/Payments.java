package org.example.hexagonarchitect.application.out;

import org.example.hexagonarchitect.application.payment.Payment;

import java.util.UUID;

public interface Payments {
    Payment findPaymentByOrderId(UUID orderId);

    Payment save(Payment payment);
}
