package ch.cryptofinance.qachallenge.service;

import ch.cryptofinance.qachallenge.exception.OrderException;
import ch.cryptofinance.qachallenge.model.CurrencyType;
import ch.cryptofinance.qachallenge.model.Order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderServiceImpl implements OrderService {

    /**
     * {@inheritDoc}
     */
    public Map<String, Double> calculateOrdersFee(List<Order> orders) throws OrderException {
        final Map<String, Double> ordersFee = new HashMap<>();

        if (orders.isEmpty()) {
            return ordersFee;
        }

        for (int i = 0; i < orders.size(); i++) {
            if (orders.size() > 1 && i + 1 < orders.size()) {
                List<Order> remainingOrders = new ArrayList<>(orders.subList(i + 1, orders.size()));
                for (int j = 0; j < remainingOrders.size(); j++) {
                    if (orders.get(i).getId().equals(remainingOrders.get(j).getId())) {
                        throw new OrderException(String.format("Duplicate order [orderId=%s]", orders.get(i).getId()));
                    }
                }
            }
        }

        orders.forEach(order -> ordersFee.put(order.getId(), calculateOrderFee(order)));
        return ordersFee;
    }

    private double calculateOrderFee(Order order) {
        double orderFee;
        if (CurrencyType.BTC == order.getCurrency() || CurrencyType.LTC == order.getCurrency()) {
            orderFee = order.getFeePercentage() / 100.0 * order.getAmount();
        } else if (CurrencyType.USD == order.getCurrency()) {
            orderFee = 0.0;
        } else {
            throw new IllegalArgumentException(String.format("Invalid argument [currencyType=%s]", order.getCurrency()));
        }
        return orderFee;
    }
}
