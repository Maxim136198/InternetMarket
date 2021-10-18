package by.itstep.internetMarket.controller;

import by.itstep.internetMarket.entity.User;

import java.util.List;

public interface UserController {

    void addUser(User user);

    void removeUser(int id);

    void updateUser(User user);

    List listUsers();

    User getUser(String name);
}
