package by.itstep.internetMarket.repository;

import by.itstep.internetMarket.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
