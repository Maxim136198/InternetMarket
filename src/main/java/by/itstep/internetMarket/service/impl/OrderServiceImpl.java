package by.itstep.internetMarket.service.impl;

import by.itstep.internetMarket.dao.repository.OrderRepository;
import by.itstep.internetMarket.dao.entity.Order;
import by.itstep.internetMarket.service.OrderService;

import java.util.List;
import java.util.Optional;

public class OrderServiceImpl implements OrderService {

    private OrderRepository orderRepository;


    @Override
    public void addOrder(Order order) {
        if (order != null) {
            List<Order> orders = orderRepository.findAll();
            if (!orders.isEmpty()) {
                Order lastOrder = orders.get(orders.size() - 1);
                order.setId(lastOrder.getId() + 1);
                orderRepository.save(order);
            }
        }
    }

    @Override
    public void removeOrder(Long id) {
        if (id != null) {
            orderRepository.deleteById(id);
        }
    }

    @Override
    public void updateOrder(Order order) {
        orderRepository.saveAndFlush(order);
    }

    @Override
    public List<Order> listOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Optional<Order> getOrder(Long id) {
        if (id != null) {
            return orderRepository.findAll(id);
        }
        return null;
    }
}
