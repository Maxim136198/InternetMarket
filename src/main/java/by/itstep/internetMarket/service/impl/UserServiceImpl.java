package by.itstep.internetMarket.service.impl;

import by.itstep.internetMarket.dao.repository.UserRepository;
import by.itstep.internetMarket.dao.entity.User;
import by.itstep.internetMarket.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserRepository userRepository;


    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public void updateUser(User user) {
        userRepository.saveAndFlush(user);
    }

    @Override
    public List listUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String name) {
        return userRepository.findByName(name);
    }
}
