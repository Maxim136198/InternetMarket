package by.itstep.internetMarket.service.impl;

import by.itstep.internetMarket.dao.entity.Order;
import by.itstep.internetMarket.dao.repository.ProductRepository;
import by.itstep.internetMarket.dao.entity.Product;
import by.itstep.internetMarket.service.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    @Override
    public void addProduct(Product product) {
        if (product != null) {
            List<Product> products = productRepository.findAll();
            if (!products.isEmpty()) {
                Product lastProduct = products.get(products.size() - 1);
                product.setId(lastProduct.getId() + 1);
                productRepository.save(product);
            }
        }
    }

    @Override
    public void removeProduct(Long id) {
        if(id!=null) {
            productRepository.deleteById(id);
        }
    }

    @Override
    public void updateProduct(Product product) {
        productRepository.saveAndFlush(product);
    }

    @Override
    public List<Product> listProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(String name) {
        if(name!=null){
            return productRepository.findByName(name);
        }
        return null;
    }
}
