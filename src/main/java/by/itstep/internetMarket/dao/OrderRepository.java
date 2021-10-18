package by.itstep.internetMarket.dao;

import by.itstep.internetMarket.entity.Order;
import by.itstep.internetMarket.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
