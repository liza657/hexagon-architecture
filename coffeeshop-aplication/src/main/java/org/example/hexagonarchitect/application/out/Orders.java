package org.example.hexagonarchitect.application.out;

import org.example.hexagonarchitect.application.order.Order;

import java.util.UUID;

public interface Orders {
    Order findOrderById(UUID orderId);

    Order save(Order order);

    void deleteById(UUID orderId);
}
