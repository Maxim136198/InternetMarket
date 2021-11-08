package by.itstep.internetMarket.service;

import by.itstep.internetMarket.dao.entity.User;

import java.util.List;


public interface UserService {
    User save(User user);

    void deleteUser(User user);

    void deleteUserById(Long id);

    User updateUser(User user);

    List<User> findAll();

    User findById(Long id);

    User findByName(String name);

}
