package by.itstep.internetMarket.controller.impl;

import by.itstep.internetMarket.controller.ProductController;
import by.itstep.internetMarket.entity.Product;
import by.itstep.internetMarket.service.ProductService;
import by.itstep.internetMarket.service.ServiceFactory;

import java.util.List;

public class ProductControllerImpl implements ProductController {

    private ProductService productService;

    public ProductControllerImpl(){
        this.productService = ServiceFactory.getInstance().getProductService();
    }

    @Override
    public void addProduct(Product product) {
        productService.addProduct(product);
    }

    @Override
    public void removeProduct(int id) {
productService.removeProduct(id);
    }

    @Override
    public void updateProduct(Product product) {
productService.updateProduct(product);
    }

    @Override
    public List<Product> listProduct() {
        return productService.listProducts();
    }

    @Override
    public Product getProduct(String name) {
        return productService.getProduct(name);
    }
}
