package by.itstep.internetMarket.service;

import by.itstep.internetMarket.dao.entity.User;

import java.util.List;

public interface UserService {
    void createUser(User user);

    void deleteUserById(Long id);

    User updateUser(User user);

    List<User> listUsers();

    User getUser(String name);

}
