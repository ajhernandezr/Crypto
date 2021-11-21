package ch.cryptofinance.qachallenge.service;

import ch.cryptofinance.qachallenge.exception.OrderException;
import ch.cryptofinance.qachallenge.model.Order;

import java.util.List;
import java.util.Map;

public interface OrderService {
    /**
     * Calculates the fee of each order in the given list.
     *
     * @param orders The list of {@link Order} orders for which the fee should be calculated.
     * @return A Map with key = orderId, value = orderFee
     * @throws OrderException when a duplicated order is processed.
     */
    Map<String, Double> calculateOrdersFee(List<Order> orders) throws OrderException;
}
