package by.itstep.internetMarket.dao;

import by.itstep.internetMarket.entity.Roles;
import by.itstep.internetMarket.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.management.relation.Role;
import java.util.List;

public interface RolesRepository extends JpaRepository<Roles, Long> {
    Roles findById(int id);
}
