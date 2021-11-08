package by.itstep.internetMarket.service.impl;


import by.itstep.internetMarket.dao.repository.UserRepository;
import by.itstep.internetMarket.dao.entity.User;
import by.itstep.internetMarket.service.RolesService;
import by.itstep.internetMarket.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    private RolesService rolesService;

    public UserServiceImpl(UserRepository userRepository, RolesService rolesService) {
        this.userRepository = userRepository;
        this.rolesService = rolesService;
    }

    @Override
    public User save(User user) {
        validate(user.getId() != null, "error.user.notHaveId");
        validate(userRepository.existsByName(user.getName()), "error.user.name.notUnique");
        return userRepository.saveAndFlush(user);
    }

    @Override
    public void deleteUser(User user) {
        final Long id = user.getId();
        validate(id == null, "error.user.haveId");
        findById(id);
        userRepository.delete(user);
    }

    @Override
    public void deleteUserById(Long id) {
        findById(id);
        userRepository.deleteById(id);
    }

    @Override
    public User updateUser(User user) {
        final Long id = user.getId();
        validate(id == null, "error.role.haveId");
        final User duplicateUser = userRepository.findByName(user.getName());
        findById(id);
        final boolean isDuplicateExists = duplicateUser != null && !Objects.equals(duplicateUser.getId(), id);
        validate(isDuplicateExists, "error.role.name.notUnique");
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
    public User findByName(String name) {
        validate(!userRepository.existsByName(name),"error.user.name.notUnique" );
        return userRepository.findByName(name);
    }

    private void validate(boolean expression, String errorMessage) {
        if (expression) {
            throw new RuntimeException(errorMessage);
        }
    }
}
