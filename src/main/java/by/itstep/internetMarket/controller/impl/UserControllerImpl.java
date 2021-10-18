package by.itstep.internetMarket.controller.impl;

import by.itstep.internetMarket.controller.UserController;
import by.itstep.internetMarket.entity.User;
import by.itstep.internetMarket.service.ServiceFactory;
import by.itstep.internetMarket.service.UserService;

import java.util.List;

public class UserControllerImpl implements UserController {

    private UserService userService;

    public UserControllerImpl(){
        this.userService = ServiceFactory.getInstance().getUserService();
    }

    @Override
    public void addUser(User user) {

    }

    @Override
    public void removeUser(int id) {

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
