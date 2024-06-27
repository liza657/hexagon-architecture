package org.example.hexagonarchitect.application;

import lombok.RequiredArgsConstructor;
import org.example.hexagonarchitect.application.in.OrderingCoffee;
import org.example.hexagonarchitect.application.order.Order;
import org.example.hexagonarchitect.application.out.Orders;
import org.example.hexagonarchitect.application.out.Payments;
import org.example.hexagonarchitect.application.payment.CreditCard;
import org.example.hexagonarchitect.application.payment.Payment;
import org.example.hexagonarchitect.application.payment.Receipt;

import java.time.LocalDate;
import java.util.UUID;

@RequiredArgsConstructor
public class CoffeeShop implements OrderingCoffee {
    private final Orders orders;
    private final Payments payments;

    @Override
    public Order placeOrder(Order order) {
        return null;
    }

    @Override
    public Order updateOrder(UUID orderId, Order order) {
        return null;
    }

    @Override
    public void canselOrder(UUID orderId) {

    }

    @Override
    public Payment payOrder(UUID orderId, CreditCard creditCard) {
        var order = orders.findOrderById(orderId);
        orders.save(order.markPaid());
        return payments.save(new Payment(orderId, creditCard, LocalDate.now()));
    }

    @Override
    public Receipt readReceipt(UUID orderId) {
        return null;
    }

    @Override
    public Order takeOrder(UUID orderId) {
        return null;
    }
}
