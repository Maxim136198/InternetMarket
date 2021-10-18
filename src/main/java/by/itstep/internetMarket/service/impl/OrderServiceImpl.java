package by.itstep.internetMarket.service.impl;

import by.itstep.internetMarket.dao.DaoFactory;
import by.itstep.internetMarket.dao.OrderDao;
import by.itstep.internetMarket.entity.Order;
import by.itstep.internetMarket.service.OrderService;

import java.util.List;

public class OrderServiceImpl implements OrderService {

    private OrderDao orderDao;

    public OrderServiceImpl () {
        this.orderDao = DaoFactory.getInstance().getOrderDao();
    }

    @Override
    public void addOrder(Order order) {

    }

    @Override
    public void removeOrder(int id) {

    }

    @Override
    public void updateOrder(Order order) {

    }

    @Override
    public List<Order> listOrders() {
        return null;
    }

    @Override
    public Order getOrder(int id) {
        return null;
    }
}
