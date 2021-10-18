package by.itstep.internetMarket.service;

import by.itstep.internetMarket.entity.Order;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    void addOrder(Order order);

    void removeOrder(Long id);

    void updateOrder(Order order);

    List<Order> listOrders();

    Optional<Order> getOrder(Long id);
}
