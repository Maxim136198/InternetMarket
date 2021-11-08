package by.itstep.internetMarket.dao.repository;

import by.itstep.internetMarket.dao.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;


public interface OrderRepository extends JpaRepository<Order, Long> {


    Order findAll(Long id);

    boolean deleteByDateOfPurchases(LocalDateTime dateOfPurchases);
}
