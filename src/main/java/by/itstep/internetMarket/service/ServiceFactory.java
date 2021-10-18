package by.itstep.internetMarket.service;

import by.itstep.internetMarket.entity.Product;
import by.itstep.internetMarket.service.impl.*;

public class ServiceFactory {
    private static ServiceFactory serviceFactory;

    private ServiceFactory () {
    }

    public static ServiceFactory getInstance() {
        if (serviceFactory == null) {
            serviceFactory = new ServiceFactory();
        }
        return serviceFactory;
    }

    public OrderService getOrderService(){
        return new OrderServiceImpl();
    }

    public ProductService getProductService(){
        return new ProductServiceImpl();
    }

    public RolesService getRolesService(){
        return new RolesServiceImpl();
    }

    public UserService getUserService(){
        return new UserServiceImpl();
    }

}
