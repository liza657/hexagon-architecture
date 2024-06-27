package org.example.hexagonarchitect.application.in;

import org.example.hexagonarchitect.application.order.Order;

import java.util.UUID;

public interface PreparingCoffee {
    Order startPrepairingOrder(UUID orderId);

    Order finishPrepairingOrder(UUID orderId);
}
