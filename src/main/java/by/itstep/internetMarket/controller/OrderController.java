package by.itstep.internetMarket.controller;

import by.itstep.internetMarket.dao.entity.Order;

import java.util.List;
import java.util.Optional;

public interface OrderController {

    void addOrder(Order order);

    void removeOrder(Long id);

    void updateOrder(Order order);

    List<Order> listOrders();

    Order getOrder(Long id);
}
