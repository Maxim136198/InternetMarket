package by.itstep.internetMarket.service;

import by.itstep.internetMarket.dao.entity.Product;

import java.util.List;

public interface ProductService {

    void addProduct(Product product);

    void removeProduct(Long id);

    void updateProduct(Product product);

    List<Product> listProducts();

    Product getProduct(String name);
}
