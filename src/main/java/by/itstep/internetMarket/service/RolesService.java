package by.itstep.internetMarket.service;

import by.itstep.internetMarket.dao.entity.Roles;

import java.util.List;

public interface RolesService {
    void addRoles(Roles roles);

    void removeRolesById(Long id);

    void updateRoles(Roles roles);

    List<Roles> listRoles();

    Roles getRoles(String name);
}
