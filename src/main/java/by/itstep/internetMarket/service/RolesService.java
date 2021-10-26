package by.itstep.internetMarket.service;

import by.itstep.internetMarket.dao.entity.Roles;

import java.util.List;

public interface RolesService {
    void addRoles(Roles roles);

    void removeRoles(Long id);

    void updateRoles(Roles roles);

    List listRoles();

    Roles getRoles(String name);
}
