package by.itstep.internetMarket.service;

import by.itstep.internetMarket.entity.Order;

import java.util.List;

public interface OrderService {
    void addOrder(Order order);

    void removeOrder(int id);

    void updateOrder(Order order);

    List<Order> listOrders();

    Order getOrder(int id);
}
