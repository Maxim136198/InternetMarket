package by.itstep.internetMarket.dao.repository;

import by.itstep.internetMarket.dao.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findByName(String name);
}
