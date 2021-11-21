package ch.cryptofinance.qachallenge;


import ch.cryptofinance.qachallenge.exception.OrderException;
import ch.cryptofinance.qachallenge.model.Order;
import ch.cryptofinance.qachallenge.service.OrderServiceImpl;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;


public class OrderServiceImplTest {

    @Test
    public void calculateOrdersFee() throws OrderException {
        OrderServiceImpl test = new OrderServiceImpl();
        Order testOrder = new Order();
        // passing order with BTC or LTC
        assertNotNull("OrdersFee is not null",test.calculateOrdersFee((List<Order>) testOrder));
        assertEquals("OrdersFee contains values", 100 ,test.calculateOrdersFee((List<Order>) testOrder));

    }

    @Test
    public void calculateOrdersFeeUSD() throws OrderException {
        OrderServiceImpl test = new OrderServiceImpl();
        Order testOrder = new Order();
        // passing order with USD
        assertEquals("OrdersFee USD contains 0", 0.0 ,test.calculateOrdersFee((List<Order>) testOrder));

    }

    @Test
    public void calculateOrdersFeeEmpty() throws OrderException {
        OrderServiceImpl test = new OrderServiceImpl();
        Order testOrder = new Order();
        // passing empty order
        assertTrue("OrdersFee is empty",test.calculateOrdersFee((List<Order>) testOrder).isEmpty());

    }



    @Test(expected = OrderException.class)
    public void orderExceptionIsThrown() throws OrderException {
        OrderServiceImpl test = new OrderServiceImpl();
        // Passing duplicated Order Id
        test.calculateOrdersFee((List<Order>) new Order());
        throw new OrderException("Duplicate order [orderId=%s], 1");

    }

    @Test(expected = IllegalArgumentException.class)
    public void illegalArgumentExceptionIsThrown() throws OrderException {
        OrderServiceImpl test = new OrderServiceImpl();
        // Passing order with value other than CurrencyType (BTC, USD, LTC)
        test.calculateOrdersFee((List<Order>) new Order());
        throw new IllegalArgumentException("Invalid argument [currencyType=%s],CHF");
    }


}
