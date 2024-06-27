package org.example.hexagonarchitect.application;

import lombok.RequiredArgsConstructor;
import org.example.hexagonarchitect.application.in.PreparingCoffee;
import org.example.hexagonarchitect.application.order.Order;
import org.example.hexagonarchitect.application.out.Orders;

import java.util.UUID;

@RequiredArgsConstructor
public class CoffeeMachine implements PreparingCoffee {

    private final Orders orders;

    @Override
    public Order startPrepairingOrder(UUID orderId) {
        var order = orders.findOrderById(orderId);
        return orders.save(order.markBeingPrepared());
    }

    @Override
    public Order finishPrepairingOrder(UUID orderId) {
        return null;
    }
}
