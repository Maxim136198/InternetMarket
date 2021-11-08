package by.itstep.internetMarket.controller.impl;

import by.itstep.internetMarket.controller.UserController;
import by.itstep.internetMarket.dao.entity.User;
import by.itstep.internetMarket.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserControllerImpl implements UserController {

    private UserService userService;


//    public FrontUser addUser(FrontUser fUser){
//        service.addUser(fUser);
//    }


    @Override
    public void addUser(User user) {

    }

    @Override
    public void removeUser(Long id) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public List listUsers() {
        return null;
    }


    @GetMapping(value = "/get")
    @Override
    public User getUser(String name) {
        return null;
    }
}
