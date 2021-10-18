package by.itstep.internetMarket.service.impl;

import by.itstep.internetMarket.dao.OrderRepository;
import by.itstep.internetMarket.entity.Order;
import by.itstep.internetMarket.service.OrderService;

import java.util.List;
import java.util.Optional;

public class OrderServiceImpl implements OrderService {

    private OrderRepository orderRepository;


    @Override
    public void addOrder(Order order) {
        orderRepository.save(order);
    }

    @Override
    public void removeOrder(Long id) {
        orderRepository.delete(id);
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
        return orderRepository.findById(id);
    }
}
