package by.itstep.internetMarket.service;

import by.itstep.internetMarket.entity.Product;

import java.util.List;

public interface ProductService {

    void addProduct(Product product);

    void removeProduct(int id);

    void updateProduct(Product product);

    List<Product> listProducts();

    Product getProduct(String name);
}
