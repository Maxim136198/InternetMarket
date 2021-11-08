package by.itstep.internetMarket.dao.repository;

import by.itstep.internetMarket.dao.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  RolesRepository extends JpaRepository<Roles, Long> {
    boolean existsByName(String name);

    Roles findByName(String name);
}
