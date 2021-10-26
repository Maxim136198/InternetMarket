package by.itstep.internetMarket.dao.repository;

import by.itstep.internetMarket.dao.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String name);
}
