package by.itstep.internetMarket.service.impl;

import by.itstep.internetMarket.dao.DaoFactory;
import by.itstep.internetMarket.dao.ProductDao;
import by.itstep.internetMarket.entity.Product;
import by.itstep.internetMarket.service.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    ProductDao productDao;

    public ProductServiceImpl() {
        this.productDao = DaoFactory.getInstance().getProductDao();
    }

    @Override
    public void addProduct(Product product) {
        productDao.addProduct(product);
    }

    @Override
    public void removeProduct(int id) {
        productDao.removeProduct(id);
    }

    @Override
    public void updateProduct(Product product) {
        productDao.updateProduct(product);
    }

    @Override
    public List<Product> listProducts() {
        return productDao.listProducts();
    }

    @Override
    public Product getProduct(String name) {
        return productDao.getProduct(name);
    }
}
