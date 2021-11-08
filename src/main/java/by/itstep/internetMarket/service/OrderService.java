package by.itstep.internetMarket.service;

import by.itstep.internetMarket.dao.entity.Order;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface OrderService {
    Order save(Order order);

    void deleteById(Long id);

    void deleteByDateOfPurchases(LocalDateTime dateOfPurchases);

    Order updateOrder(Order order);

    List<Order> findAll();

    Order findById(Long id);


}
