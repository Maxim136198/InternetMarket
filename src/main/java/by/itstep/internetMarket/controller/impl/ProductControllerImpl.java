package by.itstep.internetMarket.controller.impl;

import by.itstep.internetMarket.controller.ProductController;
import by.itstep.internetMarket.dao.entity.Product;
import by.itstep.internetMarket.service.ProductService;

import java.util.List;

public class ProductControllerImpl implements ProductController {

    private ProductService productService;

    @Override
    public void addProduct(Product product) {
        productService.save(product);
    }

    @Override
    public void removeProduct(Long id) {
productService.deleteById(id);
    }

    @Override
    public void updateProduct(Product product) {
productService.updateProduct(product);
    }

    @Override
    public List<Product> listProduct() {
        return productService.findAll();
    }

    @Override
    public Product getProduct(String name) {
        return productService.findByName(name);
    }
}
