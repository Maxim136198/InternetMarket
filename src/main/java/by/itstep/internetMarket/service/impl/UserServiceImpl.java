package by.itstep.internetMarket.service.impl;


import by.itstep.internetMarket.dao.repository.UserRepository;
import by.itstep.internetMarket.dao.entity.User;
import by.itstep.internetMarket.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;


public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(User user) {
        userRepository.delete(user);
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
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Long id) {

        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("user not found"));
    }


    @Override
    public User getUser(String name) {
        return userRepository.findByName(name);
    }
}
