package by.itstep.internetMarket.controller;

import by.itstep.internetMarket.dao.entity.Product;

import java.util.List;

public interface ProductController {

    void addProduct(Product product);

    void removeProduct(Long id);

    void updateProduct(Product product);

    List<Product> listProduct();

    Product getProduct(String name);
}
