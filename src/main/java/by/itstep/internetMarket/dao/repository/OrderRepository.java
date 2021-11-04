package by.itstep.internetMarket.dao.repository;

import by.itstep.internetMarket.dao.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.Optional;

import static org.hibernate.loader.Loader.SELECT;

public interface OrderRepository extends JpaRepository<Order, Long> {
    Order findAll(Long id);

    void deleteByDateOfPurchases(LocalDateTime dateOfPurchases);
}
