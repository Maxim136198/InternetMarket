package by.itstep.internetMarket.controller.impl;

import by.itstep.internetMarket.controller.OrderController;
import by.itstep.internetMarket.dao.entity.Order;
import by.itstep.internetMarket.service.OrderService;

import java.util.List;
import java.util.Optional;

public class OrderControllerImpl implements OrderController {

    private OrderService orderService;


    @Override
    public void addOrder(Order order) {
        orderService.addOrder(order);
    }

    @Override
    public void removeOrder(Long id) {
        orderService.removeOrder(id);
    }

    @Override
    public void updateOrder(Order order) {
        orderService.updateOrder(order);
    }

    @Override
    public List<Order> listOrders() {
        return orderService.listOrders();
    }

    @Override
    public Optional<Order> getOrder(Long id) {
        return orderService.getOrder(id);
    }
}
