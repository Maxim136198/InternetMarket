package by.itstep.internetMarket.service;

import by.itstep.internetMarket.entity.User;

import javax.management.relation.Role;
import java.util.List;

public interface UserService {
    void createUser(User user);

    void deleteUser(Long id);

    void updateUser(User user);

    List listUsers();

    User getUser(String name);

}
