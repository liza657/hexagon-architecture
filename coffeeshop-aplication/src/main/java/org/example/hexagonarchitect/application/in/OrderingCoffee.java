package org.example.hexagonarchitect.application.in;

import org.example.hexagonarchitect.application.order.Order;
import org.example.hexagonarchitect.application.payment.CreditCard;
import org.example.hexagonarchitect.application.payment.Payment;
import org.example.hexagonarchitect.application.payment.Receipt;

import java.util.UUID;

public interface OrderingCoffee {
    Order placeOrder(Order order);

    Order updateOrder(UUID orderId, Order order);

    void canselOrder(UUID orderId);

    Payment payOrder(UUID orderId, CreditCard creditCard);

    Receipt readReceipt(UUID orderId);

    Order takeOrder(UUID orderId);
}
