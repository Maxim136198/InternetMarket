package by.itstep.internetMarket.service.impl;

import by.itstep.internetMarket.dao.DaoFactory;
import by.itstep.internetMarket.dao.UserDao;
import by.itstep.internetMarket.entity.User;
import by.itstep.internetMarket.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserServiceImpl () {
        this.userDao = DaoFactory.getInstance().getUserDao();
    }

    @Override
    public void createUser(User user) {

    }

    @Override
    public void deleteUser(int id) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public List listUsers() {
        return null;
    }

    @Override
    public User getUser(String name) {
        return null;
    }
}
