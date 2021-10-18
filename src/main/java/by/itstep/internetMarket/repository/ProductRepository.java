package by.itstep.internetMarket.repository;


import by.itstep.internetMarket.entity.Product;
import org.hibernate.Session;

import javax.persistence.Query;

import static by.itstep.internetMarket.dao.HibernateConfiguration.sessionFactory;

public class ProductRepository extends GenericRepository<Product, Long>{

    private Session session;

    public ProductRepository() {
        super(Product.class);
    }

    public Product findProductByName(String name){
        session = sessionFactory.openSession();
        Query query = session.createQuery(
                "SElECT p FROM Product p WHERE p.name = :name", Product.class);
        query.setParameter("name", name);
        Product product = (Product) query.getSingleResult();
        session.close();
        return product;
    }
}
