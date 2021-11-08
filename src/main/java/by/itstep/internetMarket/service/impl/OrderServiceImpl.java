package by.itstep.internetMarket.service.impl;


import by.itstep.internetMarket.dao.repository.OrderRepository;
import by.itstep.internetMarket.dao.entity.Order;
import by.itstep.internetMarket.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.List;


public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;


    @Override
    public Order save(Order order) {
        validate(order.getId() != 0, "error.order.notHaveId");
        return orderRepository.saveAndFlush(order);
    }

    @Override
    public void deleteById(Long id) {
        findById(id);
        orderRepository.deleteById(id);
    }

    @Override
    public void deleteByDateOfPurchases(LocalDateTime dateOfPurchases) {
        validate(!orderRepository.deleteByDateOfPurchases(dateOfPurchases),"error.order.dateOfPurchases.notUnique" );
            orderRepository.deleteByDateOfPurchases(dateOfPurchases);

    }

    @Override
    public Order updateOrder(Order order) {
        final Long id = order.getId();
        validate(id == null, "error.order.haveId");
        findById(id);
        return orderRepository.saveAndFlush(order);
    }

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public Order findById(Long id) {

        return orderRepository.findById(id).orElseThrow(() -> new RuntimeException("order not found"));
    }



    private void validate(boolean expression, String errorMessage) {
        if (expression) {
            throw new RuntimeException(errorMessage);
        }
    }

}
