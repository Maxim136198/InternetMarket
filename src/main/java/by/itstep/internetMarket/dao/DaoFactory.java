package by.itstep.internetMarket.dao;

import by.itstep.internetMarket.dao.impl.*;

public class DaoFactory {
    private static DaoFactory daoFactory;

    private DaoFactory () {
    }

    public static DaoFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DaoFactory();
        }
        return daoFactory;
    }

    public OrderDao getOrderDao(){
        return new OrderDaoImpl();
    }

    public ProductDao getProductDao(){
        return new ProductDaoImpl();
    }

    public RolesDao getRolesDao(){
        return new RolesDaoImpl();
    }

    public UserDao getUserDao(){
        return new UserDaoImpl();
    }

}
