package by.itstep.internetMarket.controller;

import by.itstep.internetMarket.dao.entity.Roles;

import javax.management.relation.Role;
import java.util.List;

public interface RolesController {
    void addRoles(Roles roles);

    void removeRoles(Long id);

    void updateRoles(Roles roles);

    List listRoles();

    Roles getRoles(String name);
}
