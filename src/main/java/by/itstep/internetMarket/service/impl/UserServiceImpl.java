package by.itstep.internetMarket.service.impl;

import by.itstep.internetMarket.dao.repository.UserRepository;
import by.itstep.internetMarket.dao.entity.User;
import by.itstep.internetMarket.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.saveAndFlush(user);
    }

    @Override
    public List<User> listUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String name) {
        return userRepository.findByName(name);
    }
}
