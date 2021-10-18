package by.itstep.internetMarket.dao;

import by.itstep.internetMarket.entity.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);

    void removeUser(int id);

    void updateUser(User user);

    List listUsers();

    User getUser(String name);
}
