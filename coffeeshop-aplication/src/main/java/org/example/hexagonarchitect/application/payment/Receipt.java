package org.example.hexagonarchitect.application.payment;

import java.math.BigDecimal;
import java.time.LocalDate;

public record Receipt(
        BigDecimal amount,
        LocalDate paid
) {
}
