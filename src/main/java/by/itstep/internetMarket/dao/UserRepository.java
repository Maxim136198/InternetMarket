package by.itstep.internetMarket.dao;

import by.itstep.internetMarket.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String name);
}
