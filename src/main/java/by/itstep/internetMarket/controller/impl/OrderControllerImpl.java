package by.itstep.internetMarket.controller.impl;

import by.itstep.internetMarket.controller.OrderController;
import by.itstep.internetMarket.entity.Order;
import by.itstep.internetMarket.service.OrderService;
import by.itstep.internetMarket.service.ServiceFactory;

import java.util.List;

public class OrderControllerImpl implements OrderController {

    private OrderService orderService;

    public OrderControllerImpl() {
        this.orderService = ServiceFactory.getInstance().getOrderService();
    }

    @Override
    public void addOrder(Order order) {
        orderService.addOrder(order);
    }

    @Override
    public void removeOrder(int id) {
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
    public Order getOrder(int id) {
        return orderService.getOrder(id);
    }
}
