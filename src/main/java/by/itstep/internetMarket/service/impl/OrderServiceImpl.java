package by.itstep.internetMarket.service.impl;

import by.itstep.internetMarket.dao.repository.OrderRepository;
import by.itstep.internetMarket.dao.entity.Order;
import by.itstep.internetMarket.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;


    @Override
    public Order save(Order order) {
        if (order != null) {
            List<Order> orders = orderRepository.findAll();
            if (!orders.isEmpty()) {
                Order lastOrder = orders.get(orders.size() - 1);
                order.setId(lastOrder.getId() + 1);
                orderRepository.save(order);
            }
        }
        return null; // TODO
    }

    @Override
    public void deleteById(Long id) {
        if (id != null) {
            orderRepository.deleteById(id);
        }
    }

    @Override
    public void deleteByDateOfPurchases(LocalDateTime dateOfPurchases) {
        if (dateOfPurchases != null){
            orderRepository.deleteByDateOfPurchases(dateOfPurchases);
        }

    }

    @Override
    public Order updateOrder(Order order) {
        return orderRepository.saveAndFlush(order);
    }

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public Order findById(Long id) {
        if (id != null) {
            orderRepository.findById(id);
        }
        return orderRepository.findById(id).orElseThrow(() -> new RuntimeException("order not found"));
    }

}
