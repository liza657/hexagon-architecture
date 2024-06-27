package org.example.hexagonarchitect.application.order;

import lombok.RequiredArgsConstructor;
import org.example.hexagonarchitect.application.shared.LineItem;
import org.example.hexagonarchitect.application.shared.Location;
import org.example.hexagonarchitect.application.shared.Status;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
public class Order {
    private UUID id;
    private final Location location;
    private final List<LineItem> items;
    private Status status = Status.PAYMENT_EXPECTED;

    public Order markPaid() {
        if (status != Status.PAYMENT_EXPECTED) {
            throw new IllegalStateException("Order is already paid");
        }
        status = Status.PAID;
        return this;
    }

}
