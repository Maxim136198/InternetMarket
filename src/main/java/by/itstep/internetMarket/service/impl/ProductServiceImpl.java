package by.itstep.internetMarket.service.impl;


import by.itstep.internetMarket.dao.repository.ProductRepository;
import by.itstep.internetMarket.dao.entity.Product;
import by.itstep.internetMarket.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Objects;

public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product save(Product product) {
        validate(product.getId() != 0, "error.product.notHaveId");
        validate(productRepository.existsByName(product.getName()), "error.product.name.notUnique");
        return productRepository.saveAndFlush(product);
    }

    @Override
    public void delete(Product product) {
        final Long id = product.getId();
        validate(id == null, "error.product.haveId");
        findById(id);
        productRepository.delete(product);
    }

    @Override
    public void deleteById(Long id) {
        findById(id);
        productRepository.deleteById(id);

    }

    @Override
    public Product updateProduct(Product product) {
        final Long id = product.getId();
        validate(id == null, "error.product.haveId");
        final Product duplicateProduct = productRepository.findByName(product.getName());
        findById(id);
        final boolean isDuplicateExists = duplicateProduct != null && !Objects.equals(duplicateProduct.getId(), id);
        validate(isDuplicateExists, "error.product.name.notUnique");
        return productRepository.saveAndFlush(product);
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(Long id) {
        return productRepository.findById(id).orElseThrow(() -> new RuntimeException("product not found"));
    }

    @Override
    public Product findByName(String name) {
        validate(!productRepository.existsByName(name),"error.product.name.notUnique" );
        return productRepository.findByName(name);
    }

    private void validate(boolean expression, String errorMessage) {
        if (expression) {
            throw new RuntimeException(errorMessage);
        }
    }
}
