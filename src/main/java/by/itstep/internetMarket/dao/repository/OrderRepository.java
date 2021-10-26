package by.itstep.internetMarket.dao.repository;

import by.itstep.internetMarket.dao.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

import static org.hibernate.loader.Loader.SELECT;

public interface OrderRepository extends JpaRepository<Order, Long> {
    Optional<Order> findAll(Long id);
}
